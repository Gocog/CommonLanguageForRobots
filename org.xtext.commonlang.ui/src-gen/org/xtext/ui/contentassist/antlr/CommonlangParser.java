/*
 * generated by Xtext
 */
package org.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.services.CommonlangGrammarAccess;

public class CommonlangParser extends AbstractContentAssistParser {
	
	@Inject
	private CommonlangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.ui.contentassist.antlr.internal.InternalCommonlangParser createParser() {
		org.xtext.ui.contentassist.antlr.internal.InternalCommonlangParser result = new org.xtext.ui.contentassist.antlr.internal.InternalCommonlangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCLfileAccess().getAlternatives(), "rule__CLfile__Alternatives");
					put(grammarAccess.getScriptAccess().getAlternatives_3(), "rule__Script__Alternatives_3");
					put(grammarAccess.getBlockAccess().getAlternatives_2(), "rule__Block__Alternatives_2");
					put(grammarAccess.getSimpleExpressionAccess().getAlternatives(), "rule__SimpleExpression__Alternatives");
					put(grammarAccess.getStructureExpressionAccess().getAlternatives(), "rule__StructureExpression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0(), "rule__Assignment__VariAlternatives_0_0");
					put(grammarAccess.getMetaMetaMethodAccess().getAlternatives(), "rule__MetaMetaMethod__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getBasicValueAccess().getAlternatives(), "rule__BasicValue__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getValueAlternatives_0(), "rule__BooleanValue__ValueAlternatives_0");
					put(grammarAccess.getMethodtypeAccess().getAlternatives(), "rule__Methodtype__Alternatives");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptAccess().getGroup_3_0(), "rule__Script__Group_3_0__0");
					put(grammarAccess.getScriptAccess().getGroup_3_1(), "rule__Script__Group_3_1__0");
					put(grammarAccess.getScriptAccess().getGroup_3_1_1(), "rule__Script__Group_3_1_1__0");
					put(grammarAccess.getMetaMethodsAccess().getGroup(), "rule__MetaMethods__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_2_0(), "rule__Block__Group_2_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_4(), "rule__Method__Group_4__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getCallAccess().getGroup_3(), "rule__Call__Group_3__0");
					put(grammarAccess.getUserMethodAccess().getGroup(), "rule__UserMethod__Group__0");
					put(grammarAccess.getMetaMethodAccess().getGroup(), "rule__MetaMethod__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getElseAccess().getGroup(), "rule__Else__Group__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getScriptAccess().getNameAssignment_1(), "rule__Script__NameAssignment_1");
					put(grammarAccess.getScriptAccess().getRobottypesAssignment_3_0_1(), "rule__Script__RobottypesAssignment_3_0_1");
					put(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_0_3(), "rule__Script__RobotconfigsAssignment_3_0_3");
					put(grammarAccess.getScriptAccess().getRobottypesAssignment_3_1_1_1(), "rule__Script__RobottypesAssignment_3_1_1_1");
					put(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_1_1_3(), "rule__Script__RobotconfigsAssignment_3_1_1_3");
					put(grammarAccess.getScriptAccess().getMethodsAssignment_6(), "rule__Script__MethodsAssignment_6");
					put(grammarAccess.getMetaMethodsAccess().getNameAssignment_1(), "rule__MetaMethods__NameAssignment_1");
					put(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3(), "rule__MetaMethods__MethodsAssignment_3");
					put(grammarAccess.getBlockAccess().getExsAssignment_2_0_0(), "rule__Block__ExsAssignment_2_0_0");
					put(grammarAccess.getBlockAccess().getExsAssignment_2_1(), "rule__Block__ExsAssignment_2_1");
					put(grammarAccess.getAssignmentAccess().getVariAssignment_0(), "rule__Assignment__VariAssignment_0");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
					put(grammarAccess.getMethodAccess().getTypeAssignment_0(), "rule__Method__TypeAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3(), "rule__Method__ParametersAssignment_3");
					put(grammarAccess.getMethodAccess().getParametersAssignment_4_1(), "rule__Method__ParametersAssignment_4_1");
					put(grammarAccess.getCallAccess().getNameAssignment_0(), "rule__Call__NameAssignment_0");
					put(grammarAccess.getCallAccess().getParametersAssignment_2(), "rule__Call__ParametersAssignment_2");
					put(grammarAccess.getCallAccess().getParametersAssignment_3_1(), "rule__Call__ParametersAssignment_3_1");
					put(grammarAccess.getUserMethodAccess().getMethodAssignment_0(), "rule__UserMethod__MethodAssignment_0");
					put(grammarAccess.getUserMethodAccess().getBlAssignment_1(), "rule__UserMethod__BlAssignment_1");
					put(grammarAccess.getMetaMethodAccess().getMethodAssignment_0(), "rule__MetaMethod__MethodAssignment_0");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_0(), "rule__MetaMetaMethod__NameAssignment_0");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_1(), "rule__MetaMetaMethod__NameAssignment_1");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_2(), "rule__MetaMetaMethod__NameAssignment_2");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_3(), "rule__MetaMetaMethod__NameAssignment_3");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_4(), "rule__MetaMetaMethod__NameAssignment_4");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_5(), "rule__MetaMetaMethod__NameAssignment_5");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_6(), "rule__MetaMetaMethod__NameAssignment_6");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_7(), "rule__MetaMetaMethod__NameAssignment_7");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_8(), "rule__MetaMetaMethod__NameAssignment_8");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_9(), "rule__MetaMetaMethod__NameAssignment_9");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_10(), "rule__MetaMetaMethod__NameAssignment_10");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_11(), "rule__MetaMetaMethod__NameAssignment_11");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_12(), "rule__MetaMetaMethod__NameAssignment_12");
					put(grammarAccess.getMetaMetaMethodAccess().getNameAssignment_13(), "rule__MetaMetaMethod__NameAssignment_13");
					put(grammarAccess.getComparisonAccess().getVarleftAssignment_0(), "rule__Comparison__VarleftAssignment_0");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1(), "rule__Comparison__OpAssignment_1");
					put(grammarAccess.getComparisonAccess().getVarrightAssignment_2(), "rule__Comparison__VarrightAssignment_2");
					put(grammarAccess.getIfAccess().getExAssignment_2(), "rule__If__ExAssignment_2");
					put(grammarAccess.getIfAccess().getBlAssignment_4(), "rule__If__BlAssignment_4");
					put(grammarAccess.getElseAccess().getExAssignment_1(), "rule__Else__ExAssignment_1");
					put(grammarAccess.getForAccess().getInitAssignment_2(), "rule__For__InitAssignment_2");
					put(grammarAccess.getForAccess().getCheckAssignment_4(), "rule__For__CheckAssignment_4");
					put(grammarAccess.getForAccess().getActionAssignment_6(), "rule__For__ActionAssignment_6");
					put(grammarAccess.getForAccess().getBlAssignment_8(), "rule__For__BlAssignment_8");
					put(grammarAccess.getWhileAccess().getExAssignment_2(), "rule__While__ExAssignment_2");
					put(grammarAccess.getWhileAccess().getBlAssignment_4(), "rule__While__BlAssignment_4");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
					put(grammarAccess.getVarReferenceAccess().getVariAssignment(), "rule__VarReference__VariAssignment");
					put(grammarAccess.getDeclarationAccess().getTypeAssignment_0(), "rule__Declaration__TypeAssignment_0");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1(), "rule__Declaration__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.ui.contentassist.antlr.internal.InternalCommonlangParser typedParser = (org.xtext.ui.contentassist.antlr.internal.InternalCommonlangParser) parser;
			typedParser.entryRuleCLfile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CommonlangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CommonlangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
