package com.programs;
import java.util.Scanner;
public class Findfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		
		int i;
		System.out.println("The factors of given num is");
		for( i=1;i<=num;i++)
		
		{
			
			if(num%i==0 )
			{
				
				System.out.println( i);
			}
			
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
