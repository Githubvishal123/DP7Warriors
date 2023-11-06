package com.ArrayofContainment;

import java.util.Scanner;

public class StudentGetterSetter {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails(Student2 s) {
		System.out.println("Enter Student id");
		s.setSid(sc.nextInt());

		System.out.println("Enter name");
		s.setName(sc.next());

		// 1st way

		Course c = new Course();

		System.out.println("Enter course id :");
		c.setCid(sc.nextInt());

		System.out.println("Enter course name");
		c.setName(sc.next());

		System.out.println("Enter course fess");
		c.setFees(sc.nextInt());

		s.setCourse(c);
		// 2nd way
		s.setCourse(new Course());

		System.out.println("Enter Course id ");
		s.getCourse().setCid(sc.nextInt());

		System.out.println("Enter course name");
		s.getCourse().setName(sc.next());

		System.out.println("Enter course fees");
		s.getCourse().setFees(sc.nextInt());

	}

	static void printDetails(Student2 st[]) {
		for (Student2 s : st) {

			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		{
			Student2 stud[] = new Student2[3];

			for (int i = 0; i < stud.length; i++) {
				stud[i] = new Student2();
				enterDetails(stud[i]);

			}
			System.out.println("---------------");
			printDetails(stud);

		}

	}

}
