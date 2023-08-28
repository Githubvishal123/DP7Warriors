package com.ifelse;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
	int num=sc.nextInt();
	System.out.println("Enter any factor :");
	int fact=sc.nextInt();
	if(fact>0)
	{		
	if(num%fact==0)
	{
		
		System.out.println(fact+ "  is a factor of number "+num);
	}
	else
	{
		
		System.out.println("The given number is not a factorial ");
	}
	
	
	}
	else
	{
		System.out.println("negative factor is not allowed");
	}
	
	
	
	
	

	}

}
