/*
 * generated by Xtext
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.commonlang.Assignment;
import org.xtext.commonlang.Block;
import org.xtext.commonlang.BooleanValue;
import org.xtext.commonlang.Call;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Comparison;
import org.xtext.commonlang.Declaration;
import org.xtext.commonlang.Else;
import org.xtext.commonlang.For;
import org.xtext.commonlang.If;
import org.xtext.commonlang.MetaMetaMethod;
import org.xtext.commonlang.MetaMethod;
import org.xtext.commonlang.MetaMethods;
import org.xtext.commonlang.Method;
import org.xtext.commonlang.NumberValue;
import org.xtext.commonlang.Script;
import org.xtext.commonlang.StringValue;
import org.xtext.commonlang.UserMethod;
import org.xtext.commonlang.VarReference;
import org.xtext.commonlang.While;
import org.xtext.services.CommonlangGrammarAccess;

@SuppressWarnings("all")
public class CommonlangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CommonlangGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommonlangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommonlangPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case CommonlangPackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case CommonlangPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case CommonlangPackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case CommonlangPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case CommonlangPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case CommonlangPackage.ELSE:
				sequence_Else(context, (Else) semanticObject); 
				return; 
			case CommonlangPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case CommonlangPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case CommonlangPackage.META_META_METHOD:
				sequence_MetaMetaMethod(context, (MetaMetaMethod) semanticObject); 
				return; 
			case CommonlangPackage.META_METHOD:
				sequence_MetaMethod(context, (MetaMethod) semanticObject); 
				return; 
			case CommonlangPackage.META_METHODS:
				sequence_MetaMethods(context, (MetaMethods) semanticObject); 
				return; 
			case CommonlangPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case CommonlangPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case CommonlangPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case CommonlangPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case CommonlangPackage.USER_METHOD:
				sequence_UserMethod(context, (UserMethod) semanticObject); 
				return; 
			case CommonlangPackage.VAR_REFERENCE:
				sequence_VarReference(context, (VarReference) semanticObject); 
				return; 
			case CommonlangPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((vari=[Declaration|ID] | vari=Declaration) value=Value)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((exs+=SimpleExpression | exs+=StructureExpression)*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Method|ID] parameters+=Value? parameters+=Value*)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varleft=Value op=ComparisonOperator varright=Value)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.COMPARISON__VARLEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.COMPARISON__VARLEFT));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.COMPARISON__OP));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.COMPARISON__VARRIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.COMPARISON__VARRIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getVarleftValueParserRuleCall_0_0(), semanticObject.getVarleft());
		feeder.accept(grammarAccess.getComparisonAccess().getOpComparisonOperatorParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getComparisonAccess().getVarrightValueParserRuleCall_2_0(), semanticObject.getVarright());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Datatype name=ID)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ex=Expression
	 */
	protected void sequence_Else(EObject context, Else semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.ELSE__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.ELSE__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (init=Expression check=Expression action=Expression bl=Block)
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.FOR__INIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.FOR__INIT));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.FOR__CHECK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.FOR__CHECK));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.FOR__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.FOR__ACTION));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.FOR__BL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.FOR__BL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0(), semanticObject.getInit());
		feeder.accept(grammarAccess.getForAccess().getCheckExpressionParserRuleCall_4_0(), semanticObject.getCheck());
		feeder.accept(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0(), semanticObject.getBl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ex=Expression bl=Block)
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.IF__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.IF__EX));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.IF__BL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.IF__BL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfAccess().getExExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.accept(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0(), semanticObject.getBl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='ReadSensors' | 
	 *         name='Touching' | 
	 *         name='TouchingBoth' | 
	 *         name='TouchingLeft' | 
	 *         name='TouchingRight' | 
	 *         name='Seeing' | 
	 *         name='SeeingBoth' | 
	 *         name='SeeingLeft' | 
	 *         name='SeeingRight' | 
	 *         name='MoveForward' | 
	 *         name='MoveBackward' | 
	 *         name='TurnRight' | 
	 *         name='TurnLeft' | 
	 *         name='Idle'
	 *     )
	 */
	protected void sequence_MetaMetaMethod(EObject context, MetaMetaMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     method=Method
	 */
	protected void sequence_MetaMethod(EObject context, MetaMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.META_METHOD__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.META_METHOD__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetaMethodAccess().getMethodMethodParserRuleCall_0_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methods+=MetaMethod*)
	 */
	protected void sequence_MetaMethods(EObject context, MetaMethods semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Methodtype name=ID parameters+=Declaration? parameters+=Declaration*)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INTSTRING
	 */
	protected void sequence_NumberValue(EObject context, NumberValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.BASIC_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.BASIC_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((robottypes+=ID robotconfigs+=ID) | (robottypes+=ID robotconfigs+=ID)*) methods+=UserMethod*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.BASIC_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.BASIC_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (method=Method bl=Block)
	 */
	protected void sequence_UserMethod(EObject context, UserMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.USER_METHOD__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.USER_METHOD__METHOD));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.USER_METHOD__BL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.USER_METHOD__BL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUserMethodAccess().getMethodMethodParserRuleCall_0_0(), semanticObject.getMethod());
		feeder.accept(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_1_0(), semanticObject.getBl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     vari=[Declaration|ID]
	 */
	protected void sequence_VarReference(EObject context, VarReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.VAR_REFERENCE__VARI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.VAR_REFERENCE__VARI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarReferenceAccess().getVariDeclarationIDTerminalRuleCall_0_1(), semanticObject.getVari());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ex=Expression bl=Block)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.WHILE__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.WHILE__EX));
			if(transientValues.isValueTransient(semanticObject, CommonlangPackage.Literals.WHILE__BL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommonlangPackage.Literals.WHILE__BL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getExExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.accept(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0(), semanticObject.getBl());
		feeder.finish();
	}
}