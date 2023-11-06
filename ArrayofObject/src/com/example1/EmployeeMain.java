package com.example1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Suraj", 50000);
        Employee employee2 = new Employee(2, "vishal", 60000);
        Employee employee3 = new Employee(3, "ritu", 55000);

        Employee[] employees = {employee1, employee2, employee3};

        Employee.findHighestPaidEmployee(employees);
        Employee.sortEmployeesBySalaryDesc(employees);
    }
		
		
		
		
		
		
		
		
		
	}


