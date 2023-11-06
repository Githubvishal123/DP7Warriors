package com.arrayassignments;

import java.util.ArrayList;

public class RetainAllElements {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Vishal");
		al1.add("Suraj");
		al1.add("Anuj");
		al1.add("Kailash");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Vishal");
		al2.add("Anuj");
		al2.add("Hrishikesh");

		al1.retainAll(al2);// printing the same elements present in both list

		System.out.println(al1);

	}

}
