package com.cdac;
import java.util.Scanner;
public class VolumeofCyclinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pie=3.14;
		System.out.println("Enter radius :");
		double r=sc.nextDouble();
		System.out.println("Enter height of cyclinder");
		double h=sc.nextInt();
		double volume= pie*r*r*h;
		System.out.println("Volume of Cyclinder :"+volume );
		

	}
}


