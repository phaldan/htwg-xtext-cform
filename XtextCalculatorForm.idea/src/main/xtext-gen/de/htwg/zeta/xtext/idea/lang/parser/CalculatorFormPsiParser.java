/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.idea.lang.parser;

import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;
import de.htwg.zeta.xtext.idea.lang.CalculatorFormElementTypeProvider;
import de.htwg.zeta.xtext.idea.parser.antlr.internal.PsiInternalCalculatorFormParser;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;

public class CalculatorFormPsiParser extends AbstractXtextPsiParser {

	private static final Set<String> INITIAL_HIDDEN_TOKENS = new HashSet<String>(Arrays.asList("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT"));

	@Inject 
	private CalculatorFormGrammarAccess grammarAccess;

	@Inject 
	private CalculatorFormElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalCalculatorFormParser(builder, tokenStream, elementTypeProvider, grammarAccess);
	}

	@Override
	protected Set<String> getInitialHiddenTokens() {
		return INITIAL_HIDDEN_TOKENS;
	}
}
