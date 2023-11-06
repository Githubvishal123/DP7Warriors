package com.programs;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity :");
		int quan=sc.nextInt();
		System.out.println("Enter the prize :");
		int price=sc.nextInt();
		double item=quan*price;
		System.out.println("item bill is :"+item);
		
		}

}
