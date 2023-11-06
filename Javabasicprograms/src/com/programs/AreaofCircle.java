package com.programs;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		/*
		 * int radius=5; Double pi=3.14,area; area=pi*radius*radius;
		 * System.out.println("Area of circle:"+area);
		 * 
		 */

		/*
		 * int radius=5; double pi = 3.142, area,perimeter;
		 * 
		 * // calculating the area of the circle area = pi * radius * radius; perimeter
		 * = 2 * pi * radius ; // printing the area of the circle
		 * System.out.println("Area of circle is :" + area);
		 * System.out.println("perimeter of circle is :" + perimeter); }
		 */
		Scanner ab = new Scanner(System.in);
		Double pi = 3.14, perimeter, area;
		System.out.println("Enter the radius:");
		int radius = ab.nextInt();
		area = pi * radius * radius;
		perimeter = 2 * pi * radius * radius;

		System.out.println("Area of circle is :" + area);
		System.out.println(" perimeter of circle :" + perimeter);
	}

}
