package com.example.exercises_dialog_picker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;

public class PickerActivity extends Activity {

	NumberPicker np;
	TextView tv1, tv2;

	// initialize activity of PickerActivity.java
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.picker);

		np = (NumberPicker) findViewById(R.id.numPicker1);
		tv1 = (TextView) findViewById(R.id.txtView2);
		tv2 = (TextView) findViewById(R.id.txtView3);
		// set NumberPicker Minimum value and Maximum value
		np.setMinValue(0);
		np.setMaxValue(10);
		np.setWrapSelectorWheel(false); /*
										 * disabling wrapping around the min/max
										 * values
										 */
		// set NumberPicker change value behavior
		np.setOnValueChangedListener(new OnValueChangeListener() {

			@Override
			public void onValueChange(NumberPicker picker, int oldVal,
					int newVal) {

				String Old = "Old Value : ";
				String New = "New Value : ";
				// get the oldVal and newVal of NumberPicker
				tv1.setText(Old.concat(String.valueOf(oldVal)));
				tv2.setText(New.concat(String.valueOf(newVal)));
			}
		});
	}

}
