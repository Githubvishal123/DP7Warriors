package com.programs;

import java.util.Scanner;

public class CountNoofDigitsMethodApproach {

	static int ShowUser(int num) {

		int count = 0;
		while (num > 0) {
			int r = num % 10;
			count++;
			num = num / 10;

		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		System.out.println("The number of Digits of Given Number is " + ShowUser(n));

	}

}
