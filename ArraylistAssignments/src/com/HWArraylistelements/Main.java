
package com.HWArraylistelements;
//1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and see both variable

//memory space is printed. This is because toString is not overriden but 
//if you would have done this for Integer then beautiful output would have been printed.
//2.	Now override toString for earlier assignment and now sysout and see values are printed
//3.	WAP to print Emp whose salary is > 10000
//4.	WAP to print Emp who have name "Sachin"
//5.	WAP to print Emp who have highest number of salary

import java.util.ArrayList;

class Emp {
	private int id;
	private String name;
	private double sal;

	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";// if you override tostring method then it will
																			// not print hashcode it will print value
	}

}

public class Main { // this is beacause toString method is not overriden thats why hashcode is
					// printed
	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1, "Anuj", 12000));
		empList.add(new Emp(2, "Vishal", 150000));
		empList.add(new Emp(3, "AKshay", 3000));
		empList.add(new Emp(4, "Sachin", 7000));

		for (Emp emp : empList) {
			System.out.println("Object: " + emp);// it will print hashcode
			System.out.println("Memory space (hashCode): " + emp.hashCode());// it will print memory space
		}

		System.out.println("-------------------------------------------------------------------------------");

		for (Emp em : empList) {
			if (em.getSal() > 10000) {
				System.out.println(em);

			}

		}
		System.out.println("------------------------------------------------------------------------");

		// done by two methods //1st way
		for (Emp em : empList) {

			if (em.getName() == "Sachin") {

				System.out.println(em);

			}

			// 2nd way

			System.out.println("----------------------------------------------------------------------");
			for (Emp em1 : empList) {
				if ("Sachin".equals(em1.getName())) {

					System.out.println(em1);

				}
			}

		}
		System.out.println("---------------------------------------------------------------------------------");

		double highestsal = Double.MIN_VALUE;// it can have smallest positive nonzero value

		for (Emp em : empList) {
			if (em.getSal() > highestsal) {

				highestsal = em.getSal();

				System.out.println("Employee with highest salary " + highestsal);
			}

		}
	}
}
