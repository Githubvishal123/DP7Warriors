package com.ifelse;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the leap year :");
		y=sc.nextInt();
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			
			System.out.println("The given year is leap year :");
			
			
		}
		else
		{
			System.out.println("The given year is not leap year:");
			
		}
		
					
					
					
		
		
		
		
		
		
		
		
		

	}

}
