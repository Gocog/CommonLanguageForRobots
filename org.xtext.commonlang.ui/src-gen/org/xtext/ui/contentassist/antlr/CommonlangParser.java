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
					put(grammarAccess.getScriptAccess().getRobottypesAlternatives_4_0(), "rule__Script__RobottypesAlternatives_4_0");
					put(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_6_0(), "rule__Script__RobotconfigsAlternatives_6_0");
					put(grammarAccess.getScriptAccess().getRobottypesAlternatives_8_2_0(), "rule__Script__RobottypesAlternatives_8_2_0");
					put(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_8_4_0(), "rule__Script__RobotconfigsAlternatives_8_4_0");
					put(grammarAccess.getBlockAccess().getAlternatives_2(), "rule__Block__Alternatives_2");
					put(grammarAccess.getSimpleExpressionAccess().getAlternatives(), "rule__SimpleExpression__Alternatives");
					put(grammarAccess.getStructureExpressionAccess().getAlternatives(), "rule__StructureExpression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0(), "rule__Assignment__VariAlternatives_0_0");
					put(grammarAccess.getCallAccess().getAlternatives_0(), "rule__Call__Alternatives_0");
					put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
					put(grammarAccess.getValueExpressionAccess().getAlternatives(), "rule__ValueExpression__Alternatives");
					put(grammarAccess.getParanValueExpressionAccess().getOpAlternatives_3_0_0(), "rule__ParanValueExpression__OpAlternatives_3_0_0");
					put(grammarAccess.getBasicValueExpressionAccess().getOpAlternatives_1_0_0(), "rule__BasicValueExpression__OpAlternatives_1_0_0");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
					put(grammarAccess.getMathOperatorAccess().getAlternatives(), "rule__MathOperator__Alternatives");
					put(grammarAccess.getCrementOperatorAccess().getAlternatives(), "rule__CrementOperator__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getBasicValueAccess().getAlternatives(), "rule__BasicValue__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getValueAlternatives_0(), "rule__BooleanValue__ValueAlternatives_0");
					put(grammarAccess.getMethodtypeAccess().getAlternatives(), "rule__Methodtype__Alternatives");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getCLfileAccess().getGroup(), "rule__CLfile__Group__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptAccess().getGroup_8(), "rule__Script__Group_8__0");
					put(grammarAccess.getMetaMethodsAccess().getGroup(), "rule__MetaMethods__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_2_0(), "rule__Block__Group_2_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getCallAccess().getGroup_3(), "rule__Call__Group_3__0");
					put(grammarAccess.getMetaMethodAccess().getGroup(), "rule__MetaMethod__Group__0");
					put(grammarAccess.getMetaMethodAccess().getGroup_5(), "rule__MetaMethod__Group_5__0");
					put(grammarAccess.getUserMethodAccess().getGroup(), "rule__UserMethod__Group__0");
					put(grammarAccess.getUserMethodAccess().getGroup_4(), "rule__UserMethod__Group_4__0");
					put(grammarAccess.getParanValueExpressionAccess().getGroup(), "rule__ParanValueExpression__Group__0");
					put(grammarAccess.getParanValueExpressionAccess().getGroup_3(), "rule__ParanValueExpression__Group_3__0");
					put(grammarAccess.getBasicValueExpressionAccess().getGroup(), "rule__BasicValueExpression__Group__0");
					put(grammarAccess.getBasicValueExpressionAccess().getGroup_1(), "rule__BasicValueExpression__Group_1__0");
					put(grammarAccess.getCrementAccess().getGroup(), "rule__Crement__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getElseAccess().getGroup(), "rule__Else__Group__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getCLfileAccess().getScriptsAssignment_0(), "rule__CLfile__ScriptsAssignment_0");
					put(grammarAccess.getCLfileAccess().getMetsAssignment_1(), "rule__CLfile__MetsAssignment_1");
					put(grammarAccess.getScriptAccess().getNameAssignment_1(), "rule__Script__NameAssignment_1");
					put(grammarAccess.getScriptAccess().getRobottypesAssignment_4(), "rule__Script__RobottypesAssignment_4");
					put(grammarAccess.getScriptAccess().getRobotconfigsAssignment_6(), "rule__Script__RobotconfigsAssignment_6");
					put(grammarAccess.getScriptAccess().getRobottypesAssignment_8_2(), "rule__Script__RobottypesAssignment_8_2");
					put(grammarAccess.getScriptAccess().getRobotconfigsAssignment_8_4(), "rule__Script__RobotconfigsAssignment_8_4");
					put(grammarAccess.getScriptAccess().getMethodsAssignment_10(), "rule__Script__MethodsAssignment_10");
					put(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3(), "rule__MetaMethods__MethodsAssignment_3");
					put(grammarAccess.getBlockAccess().getExsAssignment_2_0_0(), "rule__Block__ExsAssignment_2_0_0");
					put(grammarAccess.getBlockAccess().getExsAssignment_2_1(), "rule__Block__ExsAssignment_2_1");
					put(grammarAccess.getAssignmentAccess().getVariAssignment_0(), "rule__Assignment__VariAssignment_0");
					put(grammarAccess.getAssignmentAccess().getOpAssignment_1_0(), "rule__Assignment__OpAssignment_1_0");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_1_2(), "rule__Assignment__ValueAssignment_1_2");
					put(grammarAccess.getCallAccess().getParametersAssignment_2(), "rule__Call__ParametersAssignment_2");
					put(grammarAccess.getCallAccess().getParametersAssignment_3_1(), "rule__Call__ParametersAssignment_3_1");
					put(grammarAccess.getMetaMethodAccess().getTypeAssignment_1(), "rule__MetaMethod__TypeAssignment_1");
					put(grammarAccess.getMetaMethodAccess().getNameAssignment_2(), "rule__MetaMethod__NameAssignment_2");
					put(grammarAccess.getMetaMethodAccess().getParametersAssignment_4(), "rule__MetaMethod__ParametersAssignment_4");
					put(grammarAccess.getMetaMethodAccess().getParametersAssignment_5_1(), "rule__MetaMethod__ParametersAssignment_5_1");
					put(grammarAccess.getUserMethodAccess().getTypeAssignment_0(), "rule__UserMethod__TypeAssignment_0");
					put(grammarAccess.getUserMethodAccess().getNameAssignment_1(), "rule__UserMethod__NameAssignment_1");
					put(grammarAccess.getUserMethodAccess().getParametersAssignment_3(), "rule__UserMethod__ParametersAssignment_3");
					put(grammarAccess.getUserMethodAccess().getParametersAssignment_4_1(), "rule__UserMethod__ParametersAssignment_4_1");
					put(grammarAccess.getUserMethodAccess().getBlAssignment_6(), "rule__UserMethod__BlAssignment_6");
					put(grammarAccess.getUserMethodCallAccess().getMethodAssignment(), "rule__UserMethodCall__MethodAssignment");
					put(grammarAccess.getMetaMethodCallAccess().getMethodAssignment(), "rule__MetaMethodCall__MethodAssignment");
					put(grammarAccess.getParanValueExpressionAccess().getExAssignment_1(), "rule__ParanValueExpression__ExAssignment_1");
					put(grammarAccess.getParanValueExpressionAccess().getOpAssignment_3_0(), "rule__ParanValueExpression__OpAssignment_3_0");
					put(grammarAccess.getParanValueExpressionAccess().getVarrightAssignment_3_1(), "rule__ParanValueExpression__VarrightAssignment_3_1");
					put(grammarAccess.getBasicValueExpressionAccess().getVarleftAssignment_0(), "rule__BasicValueExpression__VarleftAssignment_0");
					put(grammarAccess.getBasicValueExpressionAccess().getOpAssignment_1_0(), "rule__BasicValueExpression__OpAssignment_1_0");
					put(grammarAccess.getBasicValueExpressionAccess().getVarrightAssignment_1_1(), "rule__BasicValueExpression__VarrightAssignment_1_1");
					put(grammarAccess.getCrementAccess().getValueAssignment_0(), "rule__Crement__ValueAssignment_0");
					put(grammarAccess.getCrementAccess().getOpAssignment_1(), "rule__Crement__OpAssignment_1");
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
					put(grammarAccess.getReturnAccess().getValAssignment_1(), "rule__Return__ValAssignment_1");
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
