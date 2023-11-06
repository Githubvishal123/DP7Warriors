package com.programs;

public class Factorial3 {

	
		static void factNumber(int n)
		{
			long fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
				
				
			}
			System.out.println("THe factorial of "+n +"is "+fact);
			
		}
		
		
		
		

	
	
	public static void main(String []args)

	{
		int num;
		factNumber(7);
		factNumber(8);
		
		
	}
}
