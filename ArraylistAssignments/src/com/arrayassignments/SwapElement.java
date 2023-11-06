package com.arrayassignments;

import java.util.ArrayList;

public class SwapElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		
		System.out.println(al);
		int temp;
		for (int i = 0; i < al.size(); i++) {

			temp = al.get(2);
			al.set(2, al.get(4));
			al.set(4, temp);

		}

		System.out.println("After swapping");
		System.out.println(al);
	}

}
