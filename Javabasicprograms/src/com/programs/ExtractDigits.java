package com.programs;

public class ExtractDigits {

	
	
	static void extract(int num)
	{
		
		System.out.println("The Digits in the number "+num +" are");
		
		while(num!=0)
		{
			System.out.println(num%10);
			num=num/10;
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

					
		extract(5876);
		
		
		
		
		
		
		
	}

}
