
//15.	WAP to search the specified collection in this collection

package com.arrayassignments;

import java.util.ArrayList;

public class SearchSpecifiedCollection {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(30);
		al2.add(40);
		al2.add(50);

		ArrayList<Integer> al3 = new ArrayList<>();
		al2.add(30);
		al2.add(35);
		al2.add(40);

		boolean found = al2.contains(30);

		if (found == true) {
			System.out.println("The elements is present in SecondArrayList");

		}

		else {
			System.out.println("The elements is not present in SecondArrayList ");

		}
		
	//	al3.contains();
		
		
		
		

	}

}
