package com.ifelse;
import java.util.*;
public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name :");
		String name=sc.next();
		System.out.println("Enter Ratings :");
		float rtr=sc.nextFloat();
		System.out.println("Movie Price is 500:");
		double price=500;
		System.out.println("Enter Coupon Code:");
		int coupn=sc.nextInt();
		double nprize=(price-50);
		double nprize1=(price-100);
		
		Date dt=new Date();
		
		
		System.out.println("Coupon codes Available");
		System.out.println("Press 0 for silver and 1 for Gold");
		if(coupn==0)
		{
			System.out.println("50 rs off");
			System.out.println("your movie ticket is booked at price"+nprize);
			System.out.println("ur movie ticket is booked at date"+dt);
		}
		else if(coupn==1)
		{
			System.out.println("100 rs off");
			System.out.println("your movie ticket is booked at price"+nprize1);
			System.out.println("ur movie ticket is booked at date"+dt);
		}
		else if(coupn==2)
		{
			System.out.println(" NO off :");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
