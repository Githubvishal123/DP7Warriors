package com.arrayassignments;

import java.util.ArrayList;

public class MatchtwoCollections1 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Mango");
		al1.add("Banana");
		al1.add("Apple");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Orange");
		al2.add("Grapes");

		boolean status = al1.containsAll(al2);
		if (status = true) {
			System.out.println("the element is not present");

		} else {
			System.out.println("The element is present");

		}

	}

}
