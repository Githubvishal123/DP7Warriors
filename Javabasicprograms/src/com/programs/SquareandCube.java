package com.programs;

import java.util.Scanner;

public class SquareandCube {

	static int square(int num) {
		int square = num * num;

		return square;

	}

	static int cube(int num1) {
		int cube = num1 * square(num1);

		return cube;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the square");
		int num = sc.nextInt();
		System.out.println("Enter the number to find the cube");
		int num1 = sc.nextInt();

		int sq = square(num);

		System.out.println("The square of number is" + sq);

		int cq = cube(num1);

		System.out.println("The cube of number is " + cq);

	}
}
