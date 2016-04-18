package com.android.fragments;

import com.android.fragments.R;

import android.app.Activity;
import android.app.FragmentTransaction;
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
		
		courseListFragment.setOnCourseItemClickListener(new CourseListFragment.OnCourseItemClickListener() {
			
			public void onCourseItemClicked(int position) {
				Course course = courses.get(position);
				
				ProductFragment productFragment = new ProductFragment(course);
				
				FragmentTransaction trans = getFragmentManager().beginTransaction();
				
				trans.replace(R.id.list, productFragment);
				trans.addToBackStack(null);
				
				trans.commit();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
