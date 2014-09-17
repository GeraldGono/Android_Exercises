package com.example.exercises_bitmap;

import android.graphics.Bitmap;

public class details {
	
	private Bitmap image;
	private String name;

	// set Bitmap image and text name
	public details(Bitmap image, String name) {
		super();
		this.image = image;
		this.name = name;

	}

	public Bitmap getImage() {
		return image;
	}

	public void setImage(Bitmap image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
