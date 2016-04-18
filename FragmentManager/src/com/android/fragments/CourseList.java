package com.android.fragments;
import java.util.ArrayList;

import com.android.fragments.R;

public class CourseList extends ArrayList<Course> {

	private static final long serialVersionUID = 7843602543576923584L;

	public CourseList() {
		add(new Course(
				R.drawable.javabegin_sm,
				"Java for Complete Beginners",
				"Learn Java from scratch; includes info about setting up Java, core Java concepts and even how to get a job."));
		add(new Course(R.drawable.android_sm, "Learn Android Development",
				"Discover how to create your own Anroid apps using the Java language."));
		add(new Course(
				R.drawable.servlets_sm,
				"Servlets and JSPs",
				"Learn some of the core technologies of Java web programming; JSPs, servlets and JSTL."));
		add(new Course(
				R.drawable.swing_sm,
				"Mastering Java Swing",
				"A guide to creating Java Swing (GUI) apps. Creating desktop and browser-based applications."));
	}
}
