
//Write a java program to count the frequency of each digit

package com.programs;

import java.util.Scanner;

public class FrequencyOfdg {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
	System.out.println("Enter any Digit :");
		int digit= sc.nextInt();
		int  count=0;int r;
		
		while(num!=0)
		{
			r=num%10;
			if(r==digit)
			{
				++count;
				
				num=num/10;
			}
		}
			if(count==0)
			{
				System.out.println("NO frequency found in the given number");
				
				
			}
			else
			{
				
				System.out.println("The frequency of Each Digit of a given Number "+count);
				
			}
			
		
		
		
		
		
		
		
		
		

	}

}
