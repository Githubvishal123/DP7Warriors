package com.arrayassignments;

import java.util.ArrayList;

public class ReplaceSpecifiedElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			al.add(i);

		}

		for (Integer no : al) {
			System.out.println(no);

		}
		al.set(3, 100);// replace the specified element

		System.out.println(al);

	}

}
