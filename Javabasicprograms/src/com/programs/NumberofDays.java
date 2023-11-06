package com.programs;
import java.util.Scanner;
public class NumberofDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month name(lowercase)");
		String mName=sc.next();
		switch(mName)
		{
			case "jan":
			case "mar":
			case "May":
			case "july":
			case "aug":
			case "Oct":
			case "dec": System.out.println("31 days");
							break;
			
			case "apr":	
			case "june":
			case "sep" :
			case "nov": System.out.println("30 days");
			
			
			case "feb" :System.out.println("enter the year");
						int year=sc.nextInt();
						if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
						{
							System.out.println("29 days");
						}
			
						else
						{
							System.out.println("28");
							
						}
						
						break;
						
						default:System.out.println("error in input");
	
		}
		
	}	
		
		
		
		
		
	}


