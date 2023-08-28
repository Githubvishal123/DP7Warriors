package com.cdac;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter ur Character :");
		char ch =sc.next().charAt(0);
		
		
		switch(ch)
		{
		case '+' :System.out.println("Addition is "+(num1+num2));
		break;
		case '-': System.out.println("Subtraction is"+(num1-num2));	
	
		break;
		case '*' :System.out.println("MUltiplication is"+(num1*num2));
		break;
		case '/' :System.out.println("Division is "+(num1/num2));
		break;
		
		default :System.out.println("NO operation");
		
		
	}
		
		
		
		
		

	}

}
