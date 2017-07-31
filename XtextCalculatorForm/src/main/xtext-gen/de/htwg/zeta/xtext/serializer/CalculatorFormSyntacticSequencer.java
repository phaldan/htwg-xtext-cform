/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.serializer;

import com.google.inject.Inject;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CalculatorFormSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CalculatorFormGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FieldChoice___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CalculatorFormGrammarAccess) access;
		match_FieldChoice___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_FieldChoice___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q.equals(syntax))
				emit_FieldChoice___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     autofocus?='autofocus' (ambiguity) (rule end)
	 *     checked?='checked' (ambiguity) (rule end)
	 *     disabled?='disabled' (ambiguity) (rule end)
	 *     form=STRING (ambiguity) (rule end)
	 *     label=STRING (ambiguity) (rule end)
	 *     multiple?='multiple' (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 *     notdisplayed?='notdisplayed' (ambiguity) (rule end)
	 *     readonly?='readonly' (ambiguity) (rule end)
	 *     required?='required' (ambiguity) (rule end)
	 *     value=STRING (ambiguity) (rule end)
	 */
	protected void emit_FieldChoice___LeftCurlyBracketKeyword_12_0_RightCurlyBracketKeyword_12_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
