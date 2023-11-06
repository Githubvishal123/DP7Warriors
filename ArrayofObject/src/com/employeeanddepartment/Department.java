package com.employeeanddepartment;

public class Department {
	private int dpid;
	private String dpname;

	Department() {
		super();

	}

	Department(int dpid, String dpname) {
		this.dpid = dpid;
		this.dpname = dpname;

	}

	public int getDpid() {
		return dpid;
	}

	public void setDpid(int dpid) {
		this.dpid = dpid;
	}

	public String getDpname() {
		return dpname;
	}

	public void setDpname(String dpname) {
		this.dpname = dpname;
	}

	@Override
	public String toString() {
		return "Department [dpid=" + dpid + ", dpname=" + dpname + "]";
	}

	
	
	
	
}
