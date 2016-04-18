package com.android.fragments;

import com.android.fragments.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {
	
	private CourseList courses = new CourseList();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CourseListFragment courseListFragment = (CourseListFragment)getFragmentManager().findFragmentById(R.id.list);

		ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(this,
				R.layout.course_list_item, courses);

		courseListFragment.setListAdapter(adapter);
		
		final ProductFragment productFragment = (ProductFragment)getFragmentManager().findFragmentById(R.id.product);
		
		productFragment.setCourse(courses.get(0));
		
		courseListFragment.setOnCourseItemClickListener(new CourseListFragment.OnCourseItemClickListener() {
			
			public void onCourseItemClicked(int position) {
				Course course = courses.get(position);
				
				productFragment.setCourse(course);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
