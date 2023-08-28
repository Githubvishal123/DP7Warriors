
/*Write a Java program to find sum of all even numbers between 1 to n. 
*/
package com.Loops;
import java.util.Scanner;
public class EvenNo1toN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the numbers");
		int n=sc.nextInt();
		int sum=0;
		for(int num=2;num<=n;num++)
		{
		if(num%2==0)
		{
			
			 sum+=num;
			
			
		}
		}
		System.out.println("The sum  of Even Numbers from 1 to N are :"+ sum);
		
		
		
	}

}
