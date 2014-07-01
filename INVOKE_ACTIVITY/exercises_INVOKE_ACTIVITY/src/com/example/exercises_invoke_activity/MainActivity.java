package com.example.exercises_invoke_activity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
public class MainActivity extends Activity {

	TextView textView1, textView2;
	Button button1;

	// initialize the activity for MainActivity.java
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
		button1 = (Button) findViewById(R.id.button1);

		button1.setOnClickListener(new OnClickListener() {
			// Start a new Activity
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,
						SecondActivity.class);
				startActivityForResult(intent, 2);

			}
		});
	}

	// fetch the messages from SecondActivity.java
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == 2) {
			String message = data.getStringExtra("MESSAGE");
			String message2 = data.getStringExtra("MESSAGE2");
			textView1.setText(message);
			textView2.setText(message2);

		}

	}

}
