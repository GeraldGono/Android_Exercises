package com.example.exercises_operator_mvc;

public class Multiply implements Operation {
	// performs multiply operation and implements Operations Interface
	@Override
	public int execute(int val1, int val2) {
		return val1 * val2;
	}


}
