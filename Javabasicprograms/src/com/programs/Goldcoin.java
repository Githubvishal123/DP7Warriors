package com.programs;
import java.util.Scanner;
public class Goldcoin {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Birthday");
		int year=sc.nextInt();
	int	result=0;
		for(int i=1;i<=year;i++)
			
		{
				
			 result=year*year*year;	
				
			
			
			
		}	
		System.out.println("The gold coin given on 5th birthday is"+ result);
			
			

	}

}
