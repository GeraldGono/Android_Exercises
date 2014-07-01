package com.example.exercises_operator_mvc;

public class Subtraction implements Operation {
	// performs subtraction operation and implements Operations Interface
	@Override
	public int execute(int val1, int val2) {
		return Math.abs((val1 - val2));
	}


}
