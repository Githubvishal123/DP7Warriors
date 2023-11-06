package com.arrayassignments;

import java.util.ArrayList;

public class Matchtwocollection {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);

		ArrayList<Integer> al2 = new ArrayList<>();

		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);

		boolean status = al1.containsAll(al2);

		if (status == true) {

			System.out.println("The size and elements are same");

		}

		else {
			System.out.println("The size and elements are not same");

		}
	}
}
