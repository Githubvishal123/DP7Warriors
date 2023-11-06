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
	char ch;
	
	do {
		
		System.out.println(" 1 for Addition");
		System.out.println(" 2 for Subtraction");
		System.out.println(" 3 for Multiplication");
		System.out.println(" 4 for Division");
	switch(choice)
	{
	
	
	case 1 :System.out.println("addition :");
		int add=num1+num2;
		System.out.println(add);
	break;
	

	case 2 :
		System.out.println("Subtraction");
		int sub=num1-num2;
		System.out.println(sub);
		break;
		
	
	case 3:
	
		System.out.println("Multiplication");
		int mult=num1*num2;
		System.out.println(mult);
		break;
	
	
	case 4 :
	
		System.out.println("Division");
		int div=num1%num2;
		System.out.println(div);
		break;
		
	
	
	default :
		
	System.out.println("Error input");
	break;
			
	}
		
	System.out.println("Do u want to Continue press yes or no");
	 ch=sc.next().charAt(0);
	
		
}while(ch!='n');
	}
	}
		
	


	


