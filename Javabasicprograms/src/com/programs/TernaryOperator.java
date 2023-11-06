package com.programs;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		
		int max=(num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
		
		System.out.println("The Greater number is :"+max);
		System.out.println();
		
		int max1=(num1>num2 && num1>num3)?num1:(num2>num3)?num2:num3;
		System.out.println("The greater number is "+max1);
		
		
		
	}

}
