/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.idea.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetTypeId;
import de.htwg.zeta.xtext.idea.lang.CalculatorFormLanguage;
import org.eclipse.xtext.idea.facet.AbstractFacetType;

public class CalculatorFormFacetType extends AbstractFacetType<CalculatorFormFacetConfiguration> {

	public static final FacetTypeId<Facet<CalculatorFormFacetConfiguration>> TYPEID = new FacetTypeId<Facet<CalculatorFormFacetConfiguration>>("de.htwg.zeta.xtext.CalculatorForm");

	public CalculatorFormFacetType() {
		super(TYPEID, "de.htwg.zeta.xtext.CalculatorForm", "CalculatorForm");
		CalculatorFormLanguage.INSTANCE.injectMembers(this);
	}
}