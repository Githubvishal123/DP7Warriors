package com.example1;

public class Course {
	private int cid;
	private String name;
	private double fees;
	
	public Course()
	{
		
		super();
		
	}
	
	public Course(int cid,String name,double fees)
	{
		super();
		this.cid=cid;
		this.name=name;
		this.fees=fees;
		
		
		
		
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
	


}
