package com.android.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CourseListFragment extends ListFragment {
	
	private OnCourseItemClickListener onCourseItemClickListener;
	
	public interface OnCourseItemClickListener {
		public void onCourseItemClicked(int position);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Note: data now initialised in MainActivity.
	}

	public void setOnCourseItemClickListener(
			OnCourseItemClickListener onCourseItemClickListener) {
		this.onCourseItemClickListener = onCourseItemClickListener;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		
		if(onCourseItemClickListener != null) {
			onCourseItemClickListener.onCourseItemClicked(position);
		}
		
		/*
		Course course = courses.get(position);
		
		Toast.makeText(getActivity(), course.getDescription(), Toast.LENGTH_SHORT).show();
		*/
	}
	
	
	
}
