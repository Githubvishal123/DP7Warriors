package com.programs;

import java.util.Scanner;

public class LuckynoMethodApproach {

	static int luckyNO(int num, int luckyno) {
		int count = 0;
		while (num != 0) {
			int r = num % 10;
			if (luckyno == r)
				count++;
			num = num / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car Number");
		int n = sc.nextInt();
		System.out.println("Enter the lucky No");
		int Ln = sc.nextInt();

		System.out.println(luckyNO(n, Ln));

	}

}
