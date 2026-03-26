/*******************************************************************************
 * Copyright (c) 2021-2026 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.capella.simulink.m2m.capella.diagram;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPartViewer;
import  org.eclipse.gef.commands.CommandStack;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.PartPositionInfo;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramGenerator;
import org.eclipse.gmf.runtime.diagram.ui.render.util.DiagramImageUtils;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.model.business.internal.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;
import org.eclipse.sirius.diagram.ui.tools.internal.render.SiriusDiagramSVGGenerator;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.capella.simulink.m2m.capella.common.TransformationLogger;
import org.eclipse.capella.simulink.m2m.capella.diagram.ViewGraphicalInfomation.EdgeLocationKind;
import org.eclipse.capella.simulink.m2m.capella.diagram.ViewGraphicalInfomation.Kind;

@SuppressWarnings("restriction")
public class CoordinatesCalculator {
	
	/**
	 * The Sirius {@link DSemanticDiagram}
	 */
	protected DSemanticDiagram diagram; 
	
	/**
	 * Default constructor
	 * @param diagram the {@link DSemanticDiagram}
	 */
	public CoordinatesCalculator(DSemanticDiagram diagram) {
		this.diagram = diagram;
	}

	/**
	 * 
	 * @return a {@link Map} containing {@link ViewGraphicalInfomation} of all {@link #diagram} nodes and edges
	 */
	@SuppressWarnings("unchecked")
	public ViewGraphicalInfomation getResultMap() {
		Diagram gmfDiagram = getDiagram(diagram);
		if (gmfDiagram != null) {
			// need to find a display for UI export and tests export (headless mode)
			Display display = Display.findDisplay(Thread.currentThread ());
			if (display == null) {
				// display for headless execution 
				Display d = Display.getDefault();
				if (d.getThread() == Thread.currentThread ())
					display = d;
			}
			if (display == null)
				display = new Display();
			Shell shell = new Shell(display);
			DiagramEditPart diagramEP = getDiagramEditPart(gmfDiagram, shell);
			SiriusDiagramSVGGenerator gen = new SiriusDiagramSVGGenerator(diagramEP, true);
			List<PartPositionInfo> infos = gen.getDiagramPartInfo();
			if (!infos.isEmpty()) {
				/** Create diagram ViewGraphicalInfomation */
				ViewGraphicalInfomation vgi = getDiagramVGI(diagramEP);
//				result.put(diagram.getTarget(), vgi);
				Map<EObject, ViewGraphicalInfomation> result = new LinkedHashMap<>();
				/** Create diagram nodes ViewGraphicalInfomation */
				infos.stream().filter(info -> info.getView().getElement() != null)
							  .filter(info -> !(info.getView() instanceof Edge))
							  .forEach(info -> result.putAll(getInfoRectangleMap(info)));
				
				/** Create diagram edges ViewGraphicalInfomation */
				result.putAll(getInfoEdgeMap(diagramEP, gen, result));
				
				vgi.getChildren().putAll(result);
				
				vgi.performOriginTranslate(2* ViewGraphicalInfomation.DEFAULT_TRANSLATION, 2* ViewGraphicalInfomation.DEFAULT_TRANSLATION);
				vgi.performEndTranslate(3* ViewGraphicalInfomation.DEFAULT_TRANSLATION, 3 * ViewGraphicalInfomation.DEFAULT_TRANSLATION);
				
				/** Clean data create to compute the positions. */
				cleanGenerationData(gmfDiagram, shell, diagramEP);
				return vgi;
			}
		}
		return null;
	}
	
	protected ViewGraphicalInfomation getDiagramVGI(DiagramEditPart diagramEP) {
		Point endPoint = new Point(diagramEP.getFigure().getSize().width(), diagramEP.getFigure().getSize().height());
		ViewGraphicalInfomation vgi = new ViewGraphicalInfomation(new Point(0, 0), endPoint, Kind.Diagram);
		return vgi;
	}
	
	/**
	 * Compute and format the {@code <Rectangle,EObject>} pair for the {@code info} element
	 * @param info An info element ({@link PartPositionInfo})
	 * @return a {@link Map} containing {@link ViewGraphicalInfomation} of all <code>diagramEP</code> nodes
	 */
	protected Map<EObject, ViewGraphicalInfomation> getInfoRectangleMap(PartPositionInfo info) {
		Map<EObject, ViewGraphicalInfomation> result = new LinkedHashMap<>();
		final EObject nodeElement = info.getView().getElement();
		if (nodeElement instanceof AbstractDNode) {
			final DSemanticDecorator element = (DSemanticDecorator) nodeElement;
			final EObject eObject = element.getTarget();
			if (acceptView(info.getView())){
//				FillStyle style = (FillStyle) info.getView().getStyle(NotationPackage.eINSTANCE.getFillStyle());
				Point originPoint = new Point(info.getPartX(), info.getPartY());
				Point endPoint = new Point(info.getPartWidth(), info.getPartHeight());
				ViewGraphicalInfomation vgi = new ViewGraphicalInfomation(originPoint, endPoint, Kind.Node);
				result.put(eObject, vgi);
			}
		}
		return result;
	}

	/**
	 * Compute all {@link ViewGraphicalInfomation}s of the <code>diagramEP</code> edges
	 * @param diagramEP the {@link DiagramEditPart}
	 * @param diagGen the used {@link DiagramGenerator} to compute {@link ViewGraphicalInfomation} of diagram nodes
	 * @param vgis The {@link Map} containing all {@link ViewGraphicalInfomation} of the current diagram element 
	 * @return a {@link Map} containing {@link ViewGraphicalInfomation} of all <code>diagramEP</code> edges
	 */
	@SuppressWarnings("unchecked")
	protected Map<EObject, ViewGraphicalInfomation> getInfoEdgeMap(DiagramEditPart diagramEP, DiagramGenerator diagGen, Map<EObject, ViewGraphicalInfomation> vgis) {
		Map<EObject, ViewGraphicalInfomation> result = new LinkedHashMap<>();
		List<IGraphicalEditPart> children = (List<IGraphicalEditPart>) diagramEP.getPrimaryEditParts();
		List<IGraphicalEditPart> collect = children.stream().filter(c -> c instanceof ConnectionEditPart).collect(Collectors.toList());
		Dimension emptyImageSize = (Dimension) MapModeUtil.getMapMode(diagramEP.getFigure()).DPtoLP(new Dimension(10, 10));
		Point origin = DiagramImageUtils.calculateImageRectangle(diagramEP.getPrimaryEditParts(), diagGen.getImageMargin(), emptyImageSize).getLocation();
		collect.forEach(e -> {
			Edge edge = (Edge)e.getModel();
			Connection connectionFigure = (Connection) e.getFigure();
			// Compute Edge source location (EastPoint)
			Point srcAnchorLoc = connectionFigure.getPoints().getFirstPoint().getTranslated(new PrecisionPoint(-origin.preciseX(), -origin.preciseY()));
			Point originPoint = null;
			
			if (DiagramSemanticHelper.exportEdgeLocation(edge).equals(EdgeLocationKind.OClock)) {
				// Case of an edge source is InitialState => compute the absolute point
				Rectangle sourceRec = getEdgeSourceRectangle(edge, vgis);
				double sourceOClock = sourceRec != null ? computeOClock(sourceRec, srcAnchorLoc) : -1.0;
				originPoint = new PrecisionPoint( sourceOClock, -1);
			} else {
				// Case of an edge source is not an InitialState => compute the (X,Y) location point
				originPoint = new Point(srcAnchorLoc.x(), srcAnchorLoc.y());
			}
			// Compute Edge target location (WestPoint) => Always OClock strategy
			Point trgAnchorLoc = connectionFigure.getPoints().getLastPoint().getTranslated(new PrecisionPoint(-origin.preciseX(), -origin.preciseY()));;
			Rectangle targetRec = getEdgeTargetRectangle(edge, vgis);
			double targetOClock = targetRec != null ? computeOClock(targetRec, trgAnchorLoc) : -1.0;
			Point endPoint = new PrecisionPoint( targetOClock, -1);
			
			DSemanticDecorator element = (DSemanticDecorator) edge.getElement();
			ViewGraphicalInfomation vgi = new ViewGraphicalInfomation(originPoint, endPoint, Kind.Edge);
			vgi.setEdgeSourceLocationKind(DiagramSemanticHelper.exportEdgeLocation(edge));
			result.put(element.getTarget(), vgi);
		});
		return result;
	}
	
	/**
	 * Get the {@link Rectangle} of the edge source node 
	 * @param edge a GMF {@link Edge}
	 * @param vgis The {@link Map} containing all {@link ViewGraphicalInfomation} of the current diagram element
	 * @return the {@link Rectangle} of the Edge source node 
	 */
	protected Rectangle getEdgeSourceRectangle(Edge edge, Map<EObject, ViewGraphicalInfomation> vgis) {
		EObject sourceElement = ((DSemanticDecorator)edge.getSource().getElement()).getTarget();
		if (vgis.containsKey(sourceElement)) {
			ViewGraphicalInfomation vgi = vgis.get(sourceElement);
			return new Rectangle(vgi.getOriginPoint().x(), vgi.getOriginPoint().y(), vgi.getEndPoint().x(), vgi.getEndPoint().y());
		} else {
			TransformationLogger.logError("Can not compute source of Edge: " + edge.getElement());
		}
		return null;
	}
	
	/**
	 * Get the {@link Rectangle} of the edge target node 
	 * @param edge a GMF {@link Edge}
	 * @param vgis The {@link Map} containing all {@link ViewGraphicalInfomation} of the current diagram element
	 * @return the {@link Rectangle} of the Edge target node 
	 */
	protected Rectangle getEdgeTargetRectangle(Edge edge, Map<EObject, ViewGraphicalInfomation> vgis) {
		EObject sourceElement = ((DSemanticDecorator)edge.getTarget().getElement()).getTarget();
		if (vgis.containsKey(sourceElement)) {
			ViewGraphicalInfomation vgi = vgis.get(sourceElement);
			return new Rectangle(vgi.getOriginPoint().x(), vgi.getOriginPoint().y(), vgi.getEndPoint().x(), vgi.getEndPoint().y());
		} else {
			TransformationLogger.logError("Can not compute source of Edge: " + edge.getElement());
		}
		return null;
	}
	
	/**
	 * Compute the OClock position of a {@link Point} in a {@link Rectangle}
	 * @param bounds the reference {@link Rectangle}
	 * @param pt the {@link Point}
	 * @return a value between 0 and 12.
	 */
	public double computeOClock(Rectangle bounds, Point pt) {
		Point center = new Point(bounds.x + bounds.width / 2, bounds.y + bounds.height / 2);
		Point tpt = pt.getTranslated(center.getNegated());
		double oClock =  (Math.PI + Math.atan2(-tpt.x, tpt.y)) / Math.PI * 6;
		return oClock;
	}
	
	
	/**
	 * Get the Session associated to the current {@link DDiagram}
	 * @param diagram the {@link DDiagram}
	 * @return the Sirius {@link Session}
	 */
	private Session getSessionFromDiagram(DDiagram diagram) {
		if (diagram instanceof DSemanticDiagram) {
			return SessionManager.INSTANCE.getSession(((DSemanticDiagram) diagram).getTarget());
		}
		return null;
	}
	
	
	/**
	 * Get the GMF Diagram
	 * @param diagram a Sirius {@link DDiagram}
	 * @return the GMF {@link Diagram}
	 */
	private Diagram getDiagram(DDiagram diagram) {
		for (AnnotationEntry annotationEntry : diagram.getOwnedAnnotationEntries()) {
			if (annotationEntry.getSource().equals("GMF_DIAGRAMS")) {
				EObject data = annotationEntry.getData();
				if (data instanceof Diagram)
					return (Diagram) data;
			}
		}
		// try to find out gmf diagram by an other way (if annotation GMF_DIAGRAMS doesn't exist)
		final Resource airdResource;
		if (diagram.eResource() != null) {
			airdResource = diagram.eResource();
		} else {
			Session session = getSessionFromDiagram(diagram);
			if (session == null) {
				return null;
			}
			airdResource = session.getSessionResource();
		}
		TreeIterator<EObject> allContents = airdResource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			if (eObject instanceof Diagram) {
				Diagram gmfDiag = (Diagram) eObject;
				if (EcoreUtil.equals(gmfDiag.getElement(), diagram)) {
					return gmfDiag;
				}
			}
		}
		return null;
	}
	
	private final DiagramEditPart getDiagramEditPart(Diagram gmfDiagram, Shell shell) {
		if (gmfDiagram.eIsProxy()) {
			gmfDiagram = (Diagram) EcoreUtil.resolve(gmfDiagram, gmfDiagram.eContainer());
		}
		DiagramEditPart diagramEP = new DiagramEditPartService().createDiagramEditPart(gmfDiagram, shell, PreferencesHint.USE_DEFAULTS);
		
		/* refresh to avoid blank images */
		diagramEP.getRoot().refresh();

		/* validate to have all nodes in the right position */
		diagramEP.getFigure().validate();
		
		/*
		 * In the case of connection on EditParts created during first Refresh they will
		 * not appear until we refresh a second time Example of such cases are exchanges
		 * on DFI (mch)
		 */
		diagramEP.getRoot().refresh();
		
		/* flush the viewer to have all connections and ports */
		EditPartViewer viewer = diagramEP.getViewer();
		viewer.flush();
		return diagramEP;
	}
	
	/**
	 * Because the graphical representation of one {@link DDiagramElement} can be composed of many views, 
	 * so we have to accept a view only if the element associated with it is different from the one associated 
	 * with it parent.
	 * 
	 * @param view {@link View} element
	 * @return True if the view is the main one, False otherwise.
	 */
	private boolean acceptView(View view) {
		final EObject element = view.getElement();
		final EObject eContainer = view.eContainer();
		final EObject containerView = eContainer;
		if (containerView instanceof View) {
			final EObject containerElement = ((View) containerView).getElement();
			return !containerElement.equals(element);
		}
		throw new IllegalArgumentException("Illegal parameter: Class -> " + this.getClass().getName() + ", method -> acceptView(View view)");
	}

	/**
	 * Clean data created to compute map areas.
	 * @param gmfDiagram the exported diagram {@link Diagram}
	 * @param shell a {@link Shell}
	 * @param diagramEP {@link DiagramEditPart}
	 */
	private void cleanGenerationData(Diagram gmfDiagram, Shell shell, DiagramEditPart diagramEP) {
		shell.dispose();
		diagramEP.deactivate();
		// Memory leak : also disposing the DiagramGraphicalViewer associated to this
		// DiagramEditPart
		diagramEP.getViewer().flush();
		CommandStack commandStack = diagramEP.getViewer().getEditDomain().getCommandStack();
		commandStack.flush();
		if (diagramEP.getViewer().getControl() != null) {
			diagramEP.getViewer().getControl().dispose();
		}
		((DiagramEditDomain) diagramEP.getViewer().getEditDomain()).removeViewer(diagramEP.getViewer());
		DiagramEventBroker.stopListening(TransactionUtil.getEditingDomain(gmfDiagram));
		if (commandStack instanceof DiagramCommandStack) {
			IOperationHistory operationHistory = OperationHistoryFactory.getOperationHistory();
			operationHistory.dispose(((DiagramCommandStack) commandStack).getUndoContext(), true, true, true);
		}
	}
}
