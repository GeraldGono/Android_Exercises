package com.example.exercises_operator_mvc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.exercises_operator_mvc.R;
import com.example.exercises_operator_mvc.ControlOperation;
import com.example.exercises_operator_mvc.ModelOperation;
import com.example.exercises_operator_mvc.ViewOperation;
 
public class MainActivity extends Activity {

	public Button calculate;
	public EditText param1, param2, result;
	public RadioGroup mRadioGroup;
	public RadioButton add, sub, mul, div, max, min;

	ViewOperation view;
	ModelOperation model;
	ControlOperation mainController;

	// initialize an activity for MainActivity.java
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		calculate = (Button) this.findViewById(R.id.calculate);
		param1 = (EditText) this.findViewById(R.id.value1);
		param2 = (EditText) this.findViewById(R.id.value2);
		result = (EditText) this.findViewById(R.id.result);

		mRadioGroup = (RadioGroup) this.findViewById(R.id.radioGroup1);
		add = (RadioButton) this.findViewById(R.id.add);
		sub = (RadioButton) this.findViewById(R.id.sub);
		mul = (RadioButton) this.findViewById(R.id.multi);
		div = (RadioButton) this.findViewById(R.id.divi);
		max = (RadioButton) this.findViewById(R.id.max);
		min = (RadioButton) this.findViewById(R.id.min);

		view = new ViewOperation(this);
		mainController = new ControlOperation(view, model);
		mainController.control();
	}

}
