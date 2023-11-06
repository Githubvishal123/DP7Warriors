package com.example1;

public class School {

	static void findTopper(Student stud[]) {

		float maxMarks = Float.MIN_VALUE;
		Student st = new Student();

		for (Student s : stud) {
			if (s.getMarks() > maxMarks) {
				maxMarks = s.getMarks();
				st = s;

			}

		}
		System.out.println(st);
	}

	static void sortMarks(Student stud[]) {
		Student st = new Student();
		for (int i = 0; i < stud.length; i++) {
			for (int j = i + 1; j < stud.length; j++) {
				if (stud[i].getMarks() < stud[j].getMarks()) {
					st = stud[i];
					stud[i] = stud[j];
					stud[j] = st;

				}

			}

		}

	}

	public static void main(String[] args) {
		// Student s=new Student();
		Student st[] = new Student[5];

		// System.out.println(st[0]) return null object which is not created yet.

		st[0] = new Student(1, "Ramesh", 34.5f);
		st[1] = new Student(1, "aksahy", 54.6f);
		st[2] = new Student(1, "Rani", 87.6f);
		st[3] = new Student(1, "Ritu", 99f);
		st[4] = new Student(1, "anuj", 30f);

		for (Student s : st) {

			System.out.println(s);

		}

		System.out.println("----------------");

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);
		}

		System.out.println("-------------------------");
		System.out.println("topper of school is ");
		findTopper(st);

		System.out.println("--------------");
		sortMarks(st);

		for (Student s : st) {

			System.out.println(s);
		}

	}

}
