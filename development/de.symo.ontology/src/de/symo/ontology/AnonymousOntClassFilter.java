/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Martin Glas. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package de.symo.ontology;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.util.iterator.Filter;

@SuppressWarnings("deprecation")
public class AnonymousOntClassFilter extends Filter<OntClass> {

	@Override
	public boolean accept(OntClass ontClass) {
		if (ontClass.isAnon()) {
			return true;
		}
		return false;
	}
}
