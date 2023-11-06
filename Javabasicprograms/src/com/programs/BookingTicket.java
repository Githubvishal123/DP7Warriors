package com.programs;
import java.util.Scanner;
public class BookingTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter airlines name :");
		
		String airname=sc.next();
	
		
		System.out.println("Enter the depature place :");
		String dep=sc.next();
		
		
		System.out.println("Enter the Disitnation :");
		String dist=sc.next();
		
		System.out.println("Enter the Coupon code :");
		int coup=sc.nextInt();
		
		if(coup==12345)
		{
			double price=40000;
			double disc=(price/100)*10;
			double fprize=price-disc;
			
			
			System.out.println("Your Final prize after Discount is :" +fprize);
		
			
		}
		else {
		System.out.println("No Such code is Available");

		
	}
		
	}

}
