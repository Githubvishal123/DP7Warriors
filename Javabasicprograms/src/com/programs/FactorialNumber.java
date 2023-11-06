package com.programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number :");
	int num=sc.nextInt();
	long fact=1;
	/*for(int i=1;i<=num;i++)
	{
		
		fact*=i;
		
		
		
	}
	System.out.println(fact);
		*/
	
	for(int i=num;i>0;i--)
	{
		
		fact*=i;
		
		
	}
	System.out.println(fact);
		
		
		
		
		
}

}
