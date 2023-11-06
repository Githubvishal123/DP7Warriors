package com.programs;

public class Factorial4 {

	
		// TODO Auto-generated method stub

		
		static long factNumber(int n)
		{
			long fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
				
				
			}
			return fact;
			
			
		}
		
		
		
		

	
	
	public static void main(String []args)

	{
		
	
	long ans1=factNumber(7);
	long ans2=factNumber(8);
		
		System.out.println("the factorial of number 7 is"+ans1);
		System.out.println("The factorial of number 8 is "+ans2);
	}

		
		
		
		
	}


