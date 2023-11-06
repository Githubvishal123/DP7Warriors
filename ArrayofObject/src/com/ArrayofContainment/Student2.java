package com.ArrayofContainment;

public class Student2 {

	private int sid;
	private String name;
	private Course course;

	public Student2() {
		super();

	}

	public Student2(int sid, String name, Course course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

	
	
	
	
}
