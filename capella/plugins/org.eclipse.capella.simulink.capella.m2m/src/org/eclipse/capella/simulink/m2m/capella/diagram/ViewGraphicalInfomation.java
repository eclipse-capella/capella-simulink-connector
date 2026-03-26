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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;

/**
 * @author 
 */
public class ViewGraphicalInfomation {

	public enum Kind {
		Node, Edge, Diagram, Unknown
	}
	
	enum EdgeLocationKind {
		Point, OClock, NotApplied
	}
	
	/**
	 * Default value of element position translation
	 */
	public static final int DEFAULT_TRANSLATION = 10;
	
	/** This point defines the west point of a view. The West point is:
	 * <ul>
	 * <li> <b>Node: </b> the size of the node (width and height).</li>
	 * <li> <b>Edge: </b> the position of the connection with the target node.</li>
	 * </ul>
	 */
	private Point endPoint;
	
	/** This point defines the east point of a view. The east point is:
	 * <ul>
	 * <li> <b>Node: </b> the origin of the node (x and y).</li>
	 * <li> <b>Edge: </b> the position of the connection with the source node.</li>
	 * </ul>
	 */
	private Point originPoint;
	
	/** The view color */
	private int color;
	
	/** Graphical element kind */
	private Kind kind;
	
	/** Position kind of the Edge source. It can be either the absolute position (x,y) or a OClock position (0-12) */
	private EdgeLocationKind edgeSourceLocationKind = EdgeLocationKind.NotApplied;
	
	/** position maps of children */
	private Map<EObject, ViewGraphicalInfomation> children;
	
	/**
	 * 
	 * @param originPoint
	 * @param endPoint
	 * @param kind
	 */
	public ViewGraphicalInfomation(Point originPoint, Point endPoint, Kind kind) {
		this.endPoint = endPoint;
		this.originPoint = originPoint;
		this.kind = kind;
	}
	
	public Map<EObject, ViewGraphicalInfomation> getChildren() {
		if (children == null) {
			children = new HashMap<>();
		}
		return children;
	}
	
	public void performOriginTranslate(int dx, int dy) {
		if ((Kind.Edge.equals(this.getKind())) && EdgeLocationKind.OClock.equals(getEdgeSourceLocationKind())) {
			return ;
		}
		getOriginPoint().translate(dx, dy);
		getChildren().entrySet().stream().forEach(entry -> {
			ViewGraphicalInfomation vgi = entry.getValue();
			vgi.performOriginTranslate(dx, dy);
		});
	}
	
	public void performEndTranslate(int dx, int dy) {
		if ((Kind.Edge.equals(this.getKind())) && EdgeLocationKind.OClock.equals(getEdgeSourceLocationKind())) {
			return ;
		}
		getEndPoint().translate(dx, dy);
	}

	/**
	 * @return The view {@link Rectangle}
	 */
	public Point getEndPoint() {
		return endPoint;
	}
	
	/**
	 * @return The view {@link Rectangle}
	 */
	public Point getOriginPoint() {
		return originPoint;
	}

	/**
	 * @return the view color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * The element {@link Kind}.
	 */
	public Kind getKind() {
		return this.kind;
	}

	public EdgeLocationKind getEdgeSourceLocationKind() {
		return edgeSourceLocationKind;
	}

	public void setEdgeSourceLocationKind(EdgeLocationKind edgeLocationKind) {
		this.edgeSourceLocationKind = edgeLocationKind;
	}
}
