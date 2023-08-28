
//9.	 Write a Java program to calculate product of digits of any number.

package com.cdac;
import java.util.Scanner;
public class ProductofDgits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
			int num=sc.nextInt();
			int product=1;
			while(num>0)
			{
				product=product*(num%10);
				num=num/10;
			
				
			}
			System.out.println("The product of digits of given number is :"+product);
			
			
			
			
			
			
			
			
			
			
	}

}
