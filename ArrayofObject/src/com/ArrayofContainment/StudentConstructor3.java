package com.ArrayofContainment;

import java.util.Arrays;

public class StudentConstructor3 {

	static void countStudentCoursewise(Student2[] st, Course[] cour) {
		int count;
		for (Course c : cour) {
			count = 0;
			for (Student2 s : st) {
				if (s.getCourse().equals(c)) {
					count++;

				}

				System.out.println(c + " " + count);

			}

		}

	}

	public static void main(String[] args) {

		Course co[] = new Course[3];
		co[0] = new Course(101, "Java", 32000);
		co[1] = new Course(102, ".net", 40000);
		co[2] = new Course(102, "python", 25000);

		Student2 stud[] = new Student2[6];

		stud[0] = new Student2(1, "pratiksha", co[1]);
		stud[1] = new Student2(2, "shivam", co[2]);
		stud[2] = new Student2(3, "dipti", co[0]);

		// hard code getter and setter

		stud[3] = new Student2();
		stud[3].setSid(4);
		stud[3].setName("Vishal");
		stud[3].setCourse(co[0]);

		stud[4] = new Student2(5, "pralay", co[1]);
		stud[5] = new Student2(6, "anuj", co[1]);

		for (Student2 s : stud) {

			System.out.println(s);

		}
		System.out.println(Arrays.toString(stud));

		// total student in each course
		countStudentCoursewise(stud, co);

	}

}