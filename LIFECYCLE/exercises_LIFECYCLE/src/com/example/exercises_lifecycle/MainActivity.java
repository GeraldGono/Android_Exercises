package com.example.exercises_lifecycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnExt;

	// initialize the activity for MainActivity.java
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "On Create Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onCreate");

		btnExt = (Button) findViewById(R.id.button2);
		btnExt.setOnClickListener(new OnClickListener() {
			// set onBackPressed() method onClick event
			@Override
			public void onClick(View v) {
				onBackPressed(v);
			}
		});
	}

	// automatically activity get finished till we don't override it.
	public void onBackPressed(View view) {
		//start alertDialog 
		new AlertDialog.Builder(this)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle("Exit")
				.setMessage("Are you sure you want to exit?")
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								finish();
								System.exit(0);
							}
						}).setNegativeButton("No", null).show();
	}

	// Called when the activity is becoming visible to the user
	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "On Start Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onStart");
	}

	/*
	 * Called if the activity get visible again and the user starts interacting
	 * with the activity again
	 */
	@Override
	protected void onResume() {

		super.onResume();

		Toast.makeText(this, "On Resume Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onResume");
	}

	/*
	 * Called once another activity gets into the foreground. Always called
	 * before the activity is not visible anymore
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "On Pause Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onPause");
	}

	// Called once the activity is no longer visible
	@Override
	protected void onStop() {
		super.onStop();

		Toast.makeText(this, "On Stop Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onStop");
	}

	// Let activity a chance to clean up things before activity get destroyed
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "On Destroy Called In First Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("FirstActivity", "Inside onDestroy");

	}

	// Intent start a new activity
	public void startSecondActivity(View V) {
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		startActivity(intent);
	}

}
