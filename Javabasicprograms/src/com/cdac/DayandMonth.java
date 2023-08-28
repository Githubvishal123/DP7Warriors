package com.cdac;
import java.util.Scanner;
public class DayandMonth {

	public static void main(String[] args) {
		int Month;
		int Days;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		 Month=sc.nextInt();
		if((Month==1||Month==3||Month==5|| Month==7 || Month==9 || Month==11 ))
		
		{	System.out.println("The number of Days in month is 31");
			
		
		}
		else if((Month==4||Month==6||Month==8||Month==10))
		{
			System.out.println("The number of Days in month is 30");
			
		}	
			
		
		else if(Month==2)
			
		{
			System.out.println("The number of Days in month is 29");
			
		}
		
		
	}
		
		
		

}
