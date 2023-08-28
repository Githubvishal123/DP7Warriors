package com.ifelse;
import java.util.Scanner;
public class GreaterNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1=sc.nextInt();
		System.out.println("Enter number 2 :");
		int num2=sc.nextInt();
		System.out.println("Enter number 3 :");
		int num3=sc.nextInt();
		
		if (num1>num2)
		{
			if(num1>num3)
			{
			System.out.println("The number1 is greatest among three numbers ");
			}
			else
			{
				System.out.println("The number3 is not greater");
				
				
			}
			
		
	}
		else
		{
			if (num2>num3)
			{
				System.out.println("The number2 is greatest among three numbers ");
				
				
			}
			else
			{
				
				System.out.println("The number3 is greater among three numbers");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
