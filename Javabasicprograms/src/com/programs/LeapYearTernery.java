package com.programs;

import java.util.Scanner;

public class LeapYearTernery {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
int year=sc.nextInt();

String s=(year%4==0 && year%100!=0 || year%400==0)?"true":"False";

System.out.println(s);

	}

}
