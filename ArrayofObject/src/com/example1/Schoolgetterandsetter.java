package com.example1;

import java.util.Scanner;

public class Schoolgetterandsetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student st[] = new Student[3];

		for (int i = 0; i < st.length; i++) {

			st[i] = new Student();

			System.out.println("Enter student id");

			st[i].setSid(sc.nextInt());

			System.out.println("Enter name");
			st[i].setSname(sc.next());

			System.out.println("Enter marks ");
			st[i].setMarks(sc.nextFloat());

		}

		for (Student s : st) {

			System.out.println(s);
		}

	}

}
