package com.employeeanddepartment;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private Department dep;

	Employee() {

		super();

	}

	Employee(int id, String name, float salary,Department dep) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep=dep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
