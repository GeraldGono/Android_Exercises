package com.example.exercises_invoke_activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {


	// initialize the activity for SecondActivity.java
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		final EditText editText1, editText2;
		Button button1;

		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		button1 = (Button) findViewById(R.id.button1);

		button1.setOnClickListener(new OnClickListener() {
			// Send the message back to the MainActivity.java
			@Override
			public void onClick(View arg0) {
				String message = editText1.getText().toString();
				String message2 = editText2.getText().toString();
				Intent intent = new Intent();
				intent.putExtra("MESSAGE", message);
				intent.putExtra("MESSAGE2", message2);
				setResult(2, intent);

				finish();

			}
		});

	}

}
