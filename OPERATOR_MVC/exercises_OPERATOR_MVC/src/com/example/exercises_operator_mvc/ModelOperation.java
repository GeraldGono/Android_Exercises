package com.example.exercises_operator_mvc;

import com.example.exercises_operator_mvc.Operation;
import com.example.exercises_operator_mvc.Addition;
import com.example.exercises_operator_mvc.Context;
import com.example.exercises_operator_mvc.Division;
import com.example.exercises_operator_mvc.Maximum;
import com.example.exercises_operator_mvc.Minimum;
import com.example.exercises_operator_mvc.Multiply;
import com.example.exercises_operator_mvc.Subtraction;

public class ModelOperation {

	int operation, param1, param2;
	Context context;
	Operation arithmethicsOpn;

	// Recursive constructor
	public ModelOperation() {
		this(1, -1, -1);
	}

	// initialize constructor for ModelOperation.java
	public ModelOperation(int Operation, int param1, int param2) {
		this.operation = Operation;
		this.param1 = param1;
		this.param2 = param2;
	}

	// execute method that set Operation interface to a new java class file
	public int execute() {
		int returnValue = -1;
		switch (operation) {
		case 0:
			arithmethicsOpn = new Addition();
			break;
		case 1:
			arithmethicsOpn = new Subtraction();
			break;
		case 2:
			arithmethicsOpn = new Multiply();
			break;
		case 3:
			arithmethicsOpn = new Division();
			break;
		case 4:
			arithmethicsOpn = new Maximum();
			break;
		case 5:
			arithmethicsOpn = new Minimum();
			break;
		default:
			break;
		}
		// return value from parameters
		context = new Context(arithmethicsOpn);
		returnValue = context.executeOperation(this.param1, this.param2);

		return returnValue;
	}

}
