package com.ifelse;

import java.util.Scanner;

public class Blood {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the person age");
		int age = sc.nextInt();
		System.out.println("enter the person Weight");
		int Weight = sc.nextInt();

		System.out.println("Enter the person Gender");
		char M = sc.next().charAt(0);
		char F = sc.next().charAt(0);
		char gender;

		if (age >= 18 && Weight >= 65) {

			System.out.println("Eligible to donate blood");

		}

		else {
			System.out.println("Not eligible to donate blood");

		}

	}

}
