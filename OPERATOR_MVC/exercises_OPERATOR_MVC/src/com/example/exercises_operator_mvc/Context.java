package com.example.exercises_operator_mvc;

import android.util.Log;

public class Context {
	// Context class set the circumstances that form the setting for an event
	private Operation strategy;

	// constructor Context set strategy
	public Context(Operation strategy) {
		this.strategy = strategy;
	}
	// execute method set val1 and val2
	public int executeOperation(int val1, int val2) {
		return strategy.execute(val1, val2);
	}

}
