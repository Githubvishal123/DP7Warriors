package com.arrayassignments;

import java.util.ArrayList;

public class Arraylistwithoutgenerics {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(1);
		al.add(2);
		al.add(3);

		for (Object element : al) {

			System.out.println((Integer) element);

		}

		ArrayList sl = new ArrayList();

		sl.add("Hello");
		sl.add("World");
		sl.add("Java");

		for (Object element : sl) {

			System.out.println((String) element);

		}
	}

}
