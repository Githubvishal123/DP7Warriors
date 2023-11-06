package com.programs;
import java.util.Scanner;
public class MickeySoftwareSolution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the extra working hours :");
		int hours=sc.nextInt();
		long salary=0;
		
		
		if(hours<=24)
			salary=100*hours*365;
			
			
		
		System.out.println("Total amount after 1 year is"+salary);
		
		
		
		
		
		
		
		
	}

}
