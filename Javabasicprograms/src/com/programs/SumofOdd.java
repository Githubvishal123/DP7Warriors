package com.programs;

import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number u want addition of odd numbers");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				
				
			}
			
		}
		System.out.println("the addition of odd numbers is :"+sum);
		

	}

}
