package com.example.exercises_lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Toast.makeText(this, "On Create Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onCreate");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "On Start Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();

		Toast.makeText(this, "On Resume Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "On Pause Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();

		Toast.makeText(this, "On Stop Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "On Destroy Called In Second Activity",
				Toast.LENGTH_SHORT).show();
		Log.i("SecondActivity", "Inside onDestroy");
	}

	public void startThirdActivity(View V) {
		Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
		startActivity(intent);
	}

}
