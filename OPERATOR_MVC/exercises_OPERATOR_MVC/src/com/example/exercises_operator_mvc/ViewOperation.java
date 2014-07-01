package com.example.exercises_operator_mvc;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.exercises_operator_mvc.MainActivity;

public class ViewOperation {
	// set the elements declared in MainActivity to ViewOperation.java
	MainActivity submain;
	private Button calculate;
	private EditText param1, param2, result;
	private RadioGroup mRadioGroup;
	private RadioButton add, sub, mul, div, max, min;
	int selection;

	public ViewOperation(MainActivity submain) {
		super();
		this.submain = submain;

		this.calculate = submain.calculate;
		this.param1 = submain.param1;
		this.param2 = submain.param2;
		this.mRadioGroup = submain.mRadioGroup;
		this.add = submain.add;
		this.sub = submain.sub;
		this.mul = submain.mul;
		this.div = submain.div;
		this.max = submain.max;
		this.min = submain.min;

		this.result = submain.result;
	}

	// getter field for elements
	public Button getCalculateButton() {
		return this.calculate;
	}

	public EditText getField1() {
		return this.param1;
	}

	public EditText getField2() {
		return this.param2;
	}

	public RadioGroup getSelectionGroup() {
		return this.mRadioGroup;
	}

	public void setCalculationResult(String result) {
		this.result.setText(result);
	}

	// checked selected Operation Id
	public void setSelectedOperationCode(int checkedId) {
		if (this.add.getId() == checkedId)
			selection = 0;
		else if (this.sub.getId() == checkedId)
			selection = 1;
		else if (this.mul.getId() == checkedId)
			selection = 2;
		else if (this.div.getId() == checkedId)
			selection = 3;
		else if (this.max.getId() == checkedId)
			selection = 4;
		else if (this.min.getId() == checkedId)
			selection = 5;
	}

	// return the selected operation
	public int getSelectedOperation() {
		return this.selection;
	}

	// Display the resulting value from operation
	public void displayResult(int result) {
		this.result.setText("" + result);
	}

	// fetch Operation code from controlOperation
	private enum Operation {
		ADD("A"), SUBSTRACTION("S"), MULTIPLICATION("M"), DIVISION("D"), MAXNUM(
				"X"), MINNUM("N");

		private String statusCode;

		private Operation(String s) {
			statusCode = s;
		}

		public String getOperationCode() {
			return statusCode;
		}
	}

}
