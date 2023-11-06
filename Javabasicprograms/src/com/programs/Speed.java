package com.programs;
import java.util.Scanner;
public class Speed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Distance in Km :");
		int dist=sc.nextInt();
		System.out.println("Enter the time in hr :");
		int t=sc.nextInt();
		double speed=dist/t;
		System.out.println("THe speed in Km/hr is :"+speed);
		
		
		
		
	}

}
