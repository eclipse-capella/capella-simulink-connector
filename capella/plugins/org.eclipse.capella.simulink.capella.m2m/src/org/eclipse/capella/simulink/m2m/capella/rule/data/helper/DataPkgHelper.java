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
package org.eclipse.capella.simulink.m2m.capella.rule.data.helper;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.core.data.capellacore.AbstractDependenciesPkg;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datavalue.DataValue;

public class DataPkgHelper {

	public static Collection<AbstractDependenciesPkg> getDependentDataPkg(Object obj){
		Set<AbstractDependenciesPkg> result = new HashSet<AbstractDependenciesPkg>();
		if (obj instanceof DataPkg) {
			DataPkg dataPkg = (DataPkg) obj;
			// Case of enumerations
			caseEnumeration(result, dataPkg);
			// Class dependencies
			caseClass(result, dataPkg);
			// Class dependencies
			caseExchangeItem(result, dataPkg);

			// Containement is not a dependency !			
			//result.addAll(dataPkg.getOwnedDataPkgs());
		}
		if (obj instanceof FunctionalExchange) {
			FunctionalExchange fe = (FunctionalExchange) obj;
			fe.getExchangedItems().forEach(ei -> caseExchangeItem(result, ei));
		}
		result.remove(obj);
		return result;
	}
	
	/**
	 * Compute dependencies of by analyzing the Exchange Item Elements type
	 * @param dataPkg the {@link DataPkg} to compute its outgoing dependencies
	 * @return the {@link DataPkg} list the current dataPkg depends on
	 */
	private static void caseExchangeItem(Set<AbstractDependenciesPkg> result, DataPkg dataPkg) {
		dataPkg.getOwnedExchangeItems().forEach(ei -> caseExchangeItem(result, ei));
	}
	
	private static void caseExchangeItem(Set<AbstractDependenciesPkg> result, ExchangeItem ei) {
		EObject eContainer = ei.eContainer();
		if (eContainer instanceof AbstractDependenciesPkg)
			result.add((AbstractDependenciesPkg) eContainer);
		ei.getOwnedElements().forEach(eie -> {
			DataPkg targetDataPkg = getDataPkgAncestor(eie.getType());
			if (targetDataPkg != null) {
				result.add(targetDataPkg);
			}
		});
	}
	/**
	 * Compute dependencies of by analyzing the enumeration literals
	 * @param dataPkg the {@link DataPkg} to compute its outgoing dependencies
	 * @return the {@link DataPkg} list the current dataPkg depends on
	 */
	private static void caseEnumeration(Set<AbstractDependenciesPkg> result, DataPkg dataPkg) {
		dataPkg.getOwnedDataTypes().stream().filter(dt -> dt instanceof Enumeration).map(Enumeration.class::cast).forEach(enume -> {
			enume.getOwnedLiterals().forEach(enumLiteral -> {
				DataValue domainValue = enumLiteral.getDomainValue();
				if (domainValue != null) {
					EStructuralFeature refValueERef = domainValue.eClass().getEStructuralFeature("referencedProperty");
					if (refValueERef != null) {
						EObject referencedValue = (EObject) domainValue.eGet(refValueERef);
						DataPkg dataPkgAncestor = getDataPkgAncestor(referencedValue);
						if (dataPkgAncestor != null) {
							result.add(dataPkgAncestor);
						}
					}
				}
			});
		});
	}

	/**
	 * Compute dependencies of by analyzing the {@link Class} properties, etc.
	 * @param dataPkg the {@link DataPkg} to compute its outgoing dependencies
	 * @return the {@link DataPkg} list the current dataPkg depends on
	 */
	private static  void caseClass(Set<AbstractDependenciesPkg> result, DataPkg dataPkg) {
		dataPkg.getOwnedClasses().forEach(clazz -> {
			clazz.getContainedProperties().forEach(prop -> {
				DataPkg dataPkgAncestor = getDataPkgAncestor(prop.getType());
				if (dataPkgAncestor != null) {
					result.add(dataPkgAncestor);
				}
			});
			clazz.getSuper().forEach(elt -> {
				DataPkg dataPkgAncestor = getDataPkgAncestor(elt);
				if (dataPkgAncestor != null) {
					result.add(dataPkgAncestor);
				}
			});
		});
	}
	
	private static DataPkg getDataPkgAncestor(EObject eObject) {
		if (eObject != null) {
			EObject parent = eObject.eContainer();
			while (parent != null && !(parent instanceof DataPkg)){
				parent = parent.eContainer();
			}
			if (parent instanceof DataPkg) {
				return (DataPkg) parent;
			}
		}
		return null;
	}
}
