package com.example.exercises_dialog_picker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btn1;

	// initialize the activity of MainActivity.java
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.btn1);
		btn1.setOnClickListener(new OnClickListener() {
			// initialize AlertDialog whenever the button is clicked
			@Override
			public void onClick(View v) {
				openAlert(v);
			}
		});
	}

	// prompt AlertDialog
	private void openAlert(View view) {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				MainActivity.this);

		alertDialogBuilder.setTitle(this.getTitle() + "Decision");
		alertDialogBuilder.setMessage("Proceed to next activity?");
		// AlertDialog PositiveButton initialize the PickerActivity.java
		alertDialogBuilder.setPositiveButton("Ok",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						Intent PickerActivity = new Intent(
								getApplicationContext(), PickerActivity.class);
						startActivity(PickerActivity);
					}
				});
		// terminate AlertDialog activity
		alertDialogBuilder.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
						Toast.makeText(getApplicationContext(),
								"You chose cancel", Toast.LENGTH_SHORT).show();
					}
				});
		// terminate the MainActivity.java from process
		alertDialogBuilder.setNeutralButton("Exit",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						MainActivity.this.finish();

					}
				});
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}

}
