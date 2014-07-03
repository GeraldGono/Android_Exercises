package com.example.exercises_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
 
public class MainActivity extends Activity implements OnClickListener {

	private TextView txtOut;
	private Button buttonOk;

	// Initialize activity
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonReset;

		txtOut = (TextView) findViewById(R.id.txtView);
		buttonOk = (Button) findViewById(R.id.btnOk);
		buttonReset = (Button) findViewById(R.id.btnReset);

		buttonOk.setOnClickListener(this);
		buttonReset.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		if (v == buttonOk) {
			txtOut.setText("Button Click Me has been clicked");
			Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT).show();
		} else {
			txtOut.setText("");
			Toast.makeText(this, "GoodBye", Toast.LENGTH_SHORT).show();
			//destroy the current activity
			finish();
		}
	}

}
