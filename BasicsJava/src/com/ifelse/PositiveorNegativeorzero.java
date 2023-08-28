package com.ifelse;

import java.util.Scanner;

public class PositiveorNegativeorzero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		if(num1>0)
		{
			System.out.println("The given number is positive :"+num1);
			
			
		}
		else if(num1<0)
		{
			System.out.println("The given number is negative"+num1);
			
		}
		else
		{
			System.out.println("The number is neither negative nor positive");
			
		}

	}

}
