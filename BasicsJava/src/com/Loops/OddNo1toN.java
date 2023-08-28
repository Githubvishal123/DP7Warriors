package com.Loops;
import java.util.Scanner;
public class OddNo1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int num=1;num<=n;num++)
		{
			if(num%2!=0)
			{
				
				sum=sum+num;
				
				
			}
			
		}
		System.out.println("The sum of Odd numbers from 1 to N are : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
