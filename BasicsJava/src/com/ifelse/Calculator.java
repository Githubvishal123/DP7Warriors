package com.ifelse;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("Enter the Operation");
	int choice=sc.nextInt();
	
	if(choice==1)
	{
		System.out.println("addition :");
	int add=num1+num2;
		System.out.println(add);
	
	}
	else if(choice==2)
	{
		System.out.println("Subtraction");
		int sub=num1-num2;
		System.out.println(sub);
		
	}
	else if(choice==3)
	{
		System.out.println("Multiplication");
		int mult=num1*num2;
		System.out.println(mult);
		
	}
	
	else if(choice==4)
	{
		System.out.println("Division");
		int div=num1%num2;
		System.out.println(div);
		
	}
	
	else
	{System.out.println("Error input");
	
		
	}
	
	
	
	
	
	}

}
