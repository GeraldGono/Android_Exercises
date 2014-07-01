package com.example.exercises_bitmap;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsAdapter extends BaseAdapter {
	// initialize array list
	Context mContext;
	ArrayList<details> mList;

	public detailsAdapter(Context mContext, ArrayList<details> mList) {
		super();
		this.mContext = mContext;
		this.mList = mList;
	}

	// return list item size
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	// return item position
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mList.get(position);
	}

	// return item id position
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	// set the View element to fetch the BitMap objects resources
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		details entry = mList.get(position);
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(mContext);
			convertView = inflater.inflate(R.layout.list_item, null);
		}

		ImageView image = (ImageView) convertView.findViewById(R.id.image);
		TextView name = (TextView) convertView.findViewById(R.id.name);

		image.setImageBitmap(entry.getImage());
		name.setText(entry.getName());
		image.setOnTouchListener(new Touch()); // set Touch.java behavior

		return convertView;

	}

}
