package com.example.exercises_context_menu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	final int MENU_COLOR_CYAN = 1;
	final int MENU_COLOR_MAGENTA = 2;
	final int MENU_COLOR_YELLOW = 3;

	final int MENU_SIZE_23 = 4;
	final int MENU_SIZE_27 = 5;
	final int MENU_SIZE_31 = 6;

	Button btnColor, btnSize;
	TextView txtOut;
	LinearLayout myScreen;
	// initialize the activity for MainActivity.java
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnColor = (Button) findViewById(R.id.btnColor);
		btnSize = (Button) findViewById(R.id.btnSize);
		txtOut = (TextView) findViewById(R.id.txtView);
		myScreen = (LinearLayout) findViewById(R.id.myScreen);

		btnColor.setOnClickListener(this);
		btnSize.setOnClickListener(this);

	}
	// set element id for context menu
	@Override
	public void onClick(View v) {

		if (v == btnColor) {
			registerForContextMenu(btnColor);
			openContextMenu(v);
		} else {

			registerForContextMenu(btnSize);
			openContextMenu(v);
		}

	}
	// context menu for button color and size
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		switch (v.getId()) {
		case R.id.btnColor:
			menu.add(0, MENU_COLOR_CYAN, 0, "Cyan");
			menu.add(0, MENU_COLOR_MAGENTA, 0, "Magenta");
			menu.add(0, MENU_COLOR_YELLOW, 0, "Yellow");
			break;
		case R.id.btnSize:
			menu.add(0, MENU_SIZE_23, 0, "23");
			menu.add(0, MENU_SIZE_27, 0, "27");
			menu.add(0, MENU_SIZE_31, 0, "31");
			break;
		}
	}
	// assigned behavior to each item in context menu
	@Override
	public boolean onContextItemSelected(MenuItem item) {

		switch (item.getItemId()) {

		case MENU_COLOR_CYAN:
			btnColor.setTextColor(Color.CYAN);
			btnColor.setText("I'm CYAN");
			myScreen.setBackgroundColor(Color.CYAN);
			Toast.makeText(this, "CYAN IS CHOSEN", Toast.LENGTH_SHORT).show();
			break;
		case MENU_COLOR_MAGENTA:
			btnColor.setTextColor(Color.MAGENTA);
			btnColor.setText("I'm MAGENTA");
			myScreen.setBackgroundColor(Color.MAGENTA);
			Toast.makeText(this, "MAGENTA IS CHOSEN", Toast.LENGTH_SHORT)
					.show();
			break;
		case MENU_COLOR_YELLOW:
			btnColor.setTextColor(Color.YELLOW);
			btnColor.setText("I'm YELLOW");
			myScreen.setBackgroundColor(Color.YELLOW);
			Toast.makeText(this, "YELLOW IS CHOSEN", Toast.LENGTH_SHORT).show();
			break;

		case MENU_SIZE_23:
			btnSize.setTextSize(23);
			btnSize.setText("I'm size 23");
			Toast.makeText(this, "23 IS CHOSEN", Toast.LENGTH_SHORT).show();
			break;
		case MENU_SIZE_27:
			btnSize.setTextSize(27);
			btnSize.setText("I'm size 27");
			Toast.makeText(this, "27 IS CHOSEN", Toast.LENGTH_SHORT).show();
			break;
		case MENU_SIZE_31:
			btnSize.setTextSize(31);
			btnSize.setText("I'm size 31");
			Toast.makeText(this, "31 IS CHOSEN", Toast.LENGTH_SHORT).show();
			break;
		}
		return super.onContextItemSelected(item);
	}

}
