package com.example.exercises_simple_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	Menu menu;
	ToggleButton tUp, tDown;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tUp = (ToggleButton) findViewById(R.id.buttonup);
		tDown = (ToggleButton) findViewById(R.id.buttondown);

		tUp.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			//prompt item dog, cat, and bird in menu item
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (menu != null) {
					MenuItem item_up = menu.findItem(R.id.menu_dog);
					MenuItem item_up1 = menu.findItem(R.id.menu_cat);
					MenuItem item_up2 = menu.findItem(R.id.menu_bird);
					item_up.setVisible(isChecked);
					item_up1.setVisible(isChecked);
					item_up2.setVisible(isChecked);

				}
			}
		});

		tDown.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			//prompt item cow, horse, and sheep in menu item
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (menu != null) {
					MenuItem item_down = menu.findItem(R.id.menu_cow);
					MenuItem item_down1 = menu.findItem(R.id.menu_horse);
					MenuItem item_down2 = menu.findItem(R.id.menu_sheep);
					item_down.setVisible(isChecked);
					item_down1.setVisible(isChecked);
					item_down2.setVisible(isChecked);

				}
			}
		});

	}
	//fill the menu item
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		this.menu = menu;
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}
	//Item selections and behavior
	@Override
	public boolean onOptionsItemSelected(MenuItem Choice) {

		switch (Choice.getItemId()) {
		case R.id.menu_dog:
			Toast.makeText(MainActivity.this, "DOG is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		case R.id.menu_cat:
			Toast.makeText(MainActivity.this, "CAT is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		case R.id.menu_bird:
			Toast.makeText(MainActivity.this, "BIRD is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		case R.id.menu_cow:
			Toast.makeText(MainActivity.this, "COW is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		case R.id.menu_horse:
			Toast.makeText(MainActivity.this, "HORSE is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		case R.id.menu_sheep:
			Toast.makeText(MainActivity.this, "SHEEP is selected",
					Toast.LENGTH_SHORT).show();
			return true;

		default:
			return super.onOptionsItemSelected(Choice);

		}

	}

}
