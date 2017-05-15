/*
 * generated by Xtext
 */
package org.xtext.validation

import org.eclipse.xtext.validation.Check
import org.xtext.commonlang.Call
import org.xtext.commonlang.Declaration
import org.xtext.commonlang.VarReference
import org.xtext.commonlang.StringValue
import org.xtext.commonlang.NumberValue
import org.xtext.commonlang.BooleanValue
import org.xtext.commonlang.BasicValue
import org.xtext.commonlang.Value
import org.xtext.commonlang.Assignment
import org.xtext.commonlang.Comparison

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CommonlangValidator extends AbstractCommonlangValidator {

	@Check
	def checkCallParametersMatch(Call call) {
		if (call.getParameters().size() != call.getName().getParameters().size()) {
			error("Wrong number of arguments!",null)
		} else {
			for (var i = 0; i < call.getParameters().size(); i++) {
				var thisParam = call.getParameters().get(i)
				var thatType = call.getName().getParameters().get(i).getType();
				var thisType = getTypeOfValue(thisParam)
				
				if (thisType != thatType) {
					error("Type mismatch: Expected "+ thatType +" got " + thisType,null)
				}
			}
		}
	}
	
	
	@Check
	def checkAssignments(Assignment assignment) {
		var thisType = assignment.value.getTypeOfValue
		var thatType = assignment.vari.getType();
		
		if (thisType != thatType) {
			error("Type mismatch: Expected "+ thatType +" got " + thisType,null)
		}
	}
	
	@Check
	def checkComparisons(Comparison comparison) {
		var thisType = comparison.varleft.getTypeOfValue
		var thatType = comparison.varright.getTypeOfValue;
		
		if (thisType != thatType) {
			error("Type mismatch: Cannot compare "+ thatType +" to " + thisType,null)
		}
	}
	
	def String getTypeOfValue(Value thisVal) {
		var thisType = "";
		switch (thisVal) {
			VarReference : thisType = thisVal.vari.type
			NumberValue : thisType = "int"
			StringValue : thisType = "string"
			BooleanValue : thisType = "boolean"
		}
		return thisType
	}
	
	def String[] getMetaMethodParamList(String name) {
		switch (name) {
			case 'Idle',
			case 'TurnLeft',
			case 'TurnRight',
			case 'MoveForward',
			case 'MoveBackward' : return #["int"]
			default : return #[]
		}
	}
	
	
//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}