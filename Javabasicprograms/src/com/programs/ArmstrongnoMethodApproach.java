package com.programs;

import java.util.Scanner;

public class ArmstrongnoMethodApproach {

	static void armstrong(int num)

	{

		int count = 0;
		double temp = num;
		double sum1;
		double sum = 0;
		while (num != 0) {
			int r = num % 10;
			count++;
			sum1 = Math.pow(r, count);
			System.out.println(sum1);
			sum = sum + sum1;

			num = num / 10;
		}

		if (temp == sum)
			System.out.println("The given no is armstrong");
		else
			System.out.println("The given no is not a armstrong");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		armstrong(n);

	}

}
