/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CalculatorFormAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/htwg/zeta/xtext/parser/antlr/internal/InternalCalculatorForm.tokens");
	}
}