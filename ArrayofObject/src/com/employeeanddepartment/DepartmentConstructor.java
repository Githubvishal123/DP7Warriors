package com.employeeanddepartment;

public class DepartmentConstructor {

	static void displayCount(Employee e[], Department d[]) {
		int count=0;
		for (Department d1 : d) {
			
			for (Employee e1 : e) {
				if (e1.getDep().equals(d1)) {
					count++;

				}

			}

		}
		System.out.println("Number of department "+count);

	}

	static void display()
	{
		Employee emp1=new Employee();
		System.out.println("Enter Details ");
	
		Employee e[]=new Employee[2];
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter employee id");
			e.setId(sc.nextInt());
			
			
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Department d[] = new Department[3];

		d[0] = new Department(101, "Marketing");
		d[1] = new Department(102, "finance");
		d[2] = new Department(103, "developer");

		Employee e[] = new Employee[6];

		e[0] = new Employee(1, "vishal", 40000f, d[1]);
		e[1] = new Employee(2, "akshay", 50000f, d[0]);
		e[2] = new Employee(3, "anuj", 45000f, d[1]);
		e[3] = new Employee(4, "arun", 44000f, d[2]);
		e[4] = new Employee(5, "paratik", 46000f, d[2]);
		e[5] = new Employee(6, "paray", 30000f, d[1]);

		displayCount(e,d);

	}

}
