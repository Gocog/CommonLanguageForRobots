/*
 * generated by Xtext
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.commonlang.Script

import org.xtext.commonlang.Expression
import org.xtext.commonlang.If
import org.xtext.commonlang.For
import org.xtext.commonlang.While
import org.xtext.commonlang.Else
import org.xtext.commonlang.Assignment
import org.xtext.commonlang.Block
import org.xtext.commonlang.Declaration
import org.xtext.commonlang.BasicValue
import org.xtext.commonlang.VarReference
import org.xtext.commonlang.Value
import org.eclipse.xtext.generator.IGenerator
import java.util.ArrayList
import org.xtext.commonlang.StringValue
import org.xtext.commonlang.UserMethod
import org.xtext.commonlang.Call
import org.xtext.commonlang.ValueExpression
import org.xtext.commonlang.Crement
import org.xtext.commonlang.ParanValueExpression
import org.xtext.commonlang.BasicValueExpression
import org.xtext.commonlang.NegNumberValue
import org.xtext.commonlang.Return

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CommonlangGenerator implements IGenerator {
	
	@Override
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(Script)) {
			fsa.generateFile("/input/"+e.name + ".java",e.compile)
		}
	}
	
	def compile(Script e) {
	val metlist = new ArrayList<CharSequence>();
	for (met:e.methods) {
		metlist.add(met.compile);
	}
	
	var botlist = new ArrayList<CharSequence>();
	for (var i = 0; i < e.robottypes.size(); i++) {
		botlist.add(e.robottypes.get(i) + "," + e.robotconfigs.get(i));
	}
	
	'''
	package input;
	import java.util.ArrayList;
	import input.RobotScript;
	import CommonLanguageObjects.*;
	
	public class «e.name» extends RobotScript {
		public static void main(String[] args) {
			«e.name» roboscript = new «e.name»();
			roboscript.buildModel();
		}
		public void buildModel() {
			name = "«e.name»";
			robotlist = new ArrayList<String>();
			sc = new Script(
				new Method[] {
					«metlist.join(',')»
				}
			);
			«FOR bot:botlist»
			robotlist.add("«bot»");
			«ENDFOR»
			generateCode();
		};
	};
	'''
	}
	
	def compile(UserMethod e) {
	val parlist = new ArrayList<CharSequence>();
	for (par:e.parameters) {
		parlist.add(par.makeParameter);
	}
	'''
	new Method(
		"«e.type»",
		"«e.name»",
		new Parameter[] {
			«parlist.join(',')»
		},
		«e.bl.compile»
	)'''
	}

	def makeParameter(Declaration e)
		'''
		new Parameter(
			"«e.type»",
			"«e.name»"
			)'''
	

	def CharSequence compile(Expression e) {
		switch e {
			If : e.compile
			For : e.compile
			While : e.compile
			Assignment : e.compile
			Block : e.compile
			Call : e.compile
			Crement : e.compile
			Return : e.compile
		}
	}
	
	
	def compile(Return e) '''
		new Expression(
			"return «e.value.makeString»"
		)'''
	
	def compile(Crement e){
		var postfix = "";
		
		if (e.op == "++") {
			postfix = "+=1";
		} else {
			postfix = "-=1";
		}
		'''
		new Expression(
			"«e.value.makeString»«postfix»"
		)'''
		}
	
	def compile(If e) '''
		new If(
			«e.ex.compile»,
			«e.bl.compile»,
			«IF e.el != null»«e.el.compile»«ELSE»null«ENDIF»
		)'''
	
	def compile(For e) '''
		new For(
			«e.init.compile»,
			«e.check.compile»,
			«e.action.compile»,
			«e.bl.compile»
		)'''
	
	def compile(While e) '''
		new While(
			«e.ex.compile»,
			«e.bl.compile»
		)'''
	
	def compile(Else e) '''
		new Else(
			«e.ex.compile»
		)'''
	
	def compile(Assignment e) {
		var varstring = ""
		var ref = e.vari;
		switch ref {
			VarReference : varstring = ref.makeString.toString
			Declaration : varstring = ref.makeString.toString
		}
		'''
		new Expression(
			"«varstring» «e.op»= «e.value.makeString»"
		)'''
	}
	
	def compile(Block e) {
	val exlist = new ArrayList<CharSequence>();
	for (ex:e.exs) {
		exlist.add(ex.compile);
	}
	'''
		new Block(new Expression[] {
			«exlist.join(',')»
		})'''
	}
	
	def makeString(Value e) {
		switch e {
			Call : (e as Call).makeString
			BasicValue : (e as BasicValue).makeString
			VarReference : (e as VarReference).makeString
		}
	}
		
	def compile(ValueExpression e) '''
		new Expression(
			"«e.makeString»"
		)'''
	
	def compile(Declaration e) '''
		new Expression(
			"«e.makeString»"
		)'''
	
	def compile(Call e) {
	'''
		new Expression(
			"«e.makeString»"
		)'''
	}
	
	def makeString(Call e) {
	val parlist = new ArrayList<CharSequence>();
	for (par:e.parameters) {
		parlist.add(par.makeString)
	}
	'''
		«e.method.name»(«parlist.join(',')»)'''
	}
	
	def CharSequence makeString(ValueExpression e) {
		switch (e) {
			NegNumberValue : '''-«e.makeString»'''
			BasicValueExpression: '''«e.makeString»'''
			ParanValueExpression: '''(«e.ex.makeString»)«IF e.varright != null»«e.op»«e.varright.makeString»«ENDIF»'''
		}
	}
	
	def makeString(NegNumberValue e) {'''
		«e.varleft.makeString»«IF e.varright != null»«e.op»«e.varright.makeString»«ENDIF»'''
	}
	
	def CharSequence makeString(BasicValueExpression e) {'''
		«e.varleft.makeString»«IF e.varright != null»«e.op»«e.varright.makeString»«ENDIF»'''
	}
	
	def makeString(Declaration e) '''
		«e.type» «e.name»'''
	
	def makeString(BasicValue e) { 
		switch(e) {		
			StringValue : '''\"«e.value»\"'''
			default : '''«e.value»'''
		}
	}
	
	def makeString(VarReference e) '''
		«e.vari.name»'''
}
