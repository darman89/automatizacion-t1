/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import talleruno.Recurso
import talleruno.VPC
import talleruno.Infraestructura
import talleruno.AmbienteDespliegue
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {
	override public IScope getScope(EObject context, EReference reference)
	{
		if (context instanceof Recurso && reference.name == "vpc")
		{
			System.out.println(context.eContainer.eContents.get(1));
			return Scopes::scopeFor((context.eContainer.eContainer.eContents.get(1) as AmbienteDespliegue).vpc);
		}
		
		System.out.println(":(");
		return null;
	}
}
