/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.idea

import com.google.inject.Guice
import de.htwg.zeta.xtext.CalculatorFormRuntimeModule
import de.htwg.zeta.xtext.CalculatorFormStandaloneSetupGenerated
import org.eclipse.xtext.util.Modules2

class CalculatorFormStandaloneSetupIdea extends CalculatorFormStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new CalculatorFormRuntimeModule()
		val ideaModule = new CalculatorFormIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
