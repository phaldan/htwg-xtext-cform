/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class CalculatorFormIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new CalculatorFormStandaloneSetupIdea().createInjector
	}

}
