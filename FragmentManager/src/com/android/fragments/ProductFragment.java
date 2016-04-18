package com.android.fragments;

import com.android.fragments.R;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductFragment extends Fragment {
	
	private Course course;
	
	public ProductFragment() {
		
	}
	
	public ProductFragment(Course course) {
		this.course = course;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Initialization here.
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.product_fragment, container, false);
		
		if(course != null) {
			setCourse(course, view);
		}
		
		return view;
	}
	
	public void setCourse(Course course) {
		View view = getView();
		
		setCourse(course, view);
	}
	
	private void setCourse(Course course, View view) {
		
		ImageView imageView = (ImageView)view.findViewById(R.id.image);
		TextView titleView = (TextView)view.findViewById(R.id.title);
		TextView descriptionView = (TextView)view.findViewById(R.id.description);
		
		Drawable icon = getResources().getDrawable(course.getImageId());
		
		imageView.setImageDrawable(icon);
		titleView.setText(course.getTitle());
		descriptionView.setText(course.getDescription());
	}

	@Override
	public void onPause() {
		// Save data if necessary.
		super.onPause();
	}

}
