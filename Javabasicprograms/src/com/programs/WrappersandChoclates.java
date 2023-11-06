package com.programs;
import java.util.Scanner;
public class WrappersandChoclates {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rupees to Buy Choclates");
		int rupees=sc.nextInt();
		
		int choclates=0;
		int wrappers=0;
		for(int i=1;i<=5;i++)
		{
			choclates++;
			wrappers++;
			
			if(choclates%3==0)
			{
				if(wrappers%3==0)
				{
					choclates++;
					wrappers++;
					
					
				}
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
