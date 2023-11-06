package com.example1;

public class Student {

	private int sid;
	private String sname;
	private float marks;

	Student() {

	}

	Student(int sid, String sname, float marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
