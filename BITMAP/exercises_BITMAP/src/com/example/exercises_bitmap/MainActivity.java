package com.example.exercises_bitmap;

import java.util.ArrayList;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView liView;
	ArrayList<details> listDetails = new ArrayList<details>();
	detailsAdapter adapter;
 
	// initialize the activity for MainActivity.java
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		liView = (ListView) findViewById(R.id.listView1);
		// populate the list with BitMaps from drawable resources
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.ai), "Allen Iverson"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.melo), "Carmelo Anthony"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.cp3), "Chris Paul"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.derrick), "Derrick Rose"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.wade), "Dwyane Wade"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.john), "John Wall"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.kemba), "Kemba Walker"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.kobe), "Kobe Bryant"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.kyrie), "Kyrie Irving"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.paul), "Paul George"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.rondo), "Rajon Rondo"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.russell), "Russell Westbrook"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.stephen), "Stephen Curry"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.steve), "Steve Nash"));
		listDetails.add(new details(BitmapFactory.decodeResource(
				getResources(), R.drawable.tony), "Tony Parker"));
		// connects the details and the underlying data for the view
		adapter = new detailsAdapter(getApplicationContext(), listDetails);
		liView.setAdapter(adapter);

	}

}
