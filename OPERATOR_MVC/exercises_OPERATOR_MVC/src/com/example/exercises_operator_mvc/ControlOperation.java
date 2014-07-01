package com.example.exercises_operator_mvc;

import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.exercises_operator_mvc.ModelOperation;
import com.example.exercises_operator_mvc.ViewOperation;

public class ControlOperation implements OnClickListener,
		OnCheckedChangeListener {

	ViewOperation view;
	ModelOperation model;
	int result;

	public ControlOperation(ViewOperation view, ModelOperation model) {
		super();
		this.view = view;
		this.model = model;
	}

	// set calculate and selection behavior from changes
	public void control() {
		view.getCalculateButton().setOnClickListener(this);
		view.getSelectionGroup().setOnCheckedChangeListener(this);
	}

	// checked the radio button being selected via Id
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {

		view.setSelectedOperationCode(checkedId);
	}

	// fetch the resulting value on click
	@Override
	public void onClick(android.view.View v) {
		String value1 = view.getField1().getText().toString();
		String value2 = view.getField2().getText().toString();
		int selection = view.getSelectedOperation();

		this.model = new ModelOperation(selection, Integer.parseInt(value1),
				Integer.parseInt(value2));
		result = this.model.execute();
		view.displayResult(result);

	}

}
