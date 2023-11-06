package com.programs;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub1 marks :");
		int sub1=sc.nextInt();
		System.out.println("Enter sub2 maks :");
		int sub2=sc.nextInt();
		System.out.println("Enter sub 3 marks :");
		int sub3=sc.nextInt();
		System.out.println("Enter sub4 marks :");
		int sub4=sc.nextInt();
		double total=sub1+sub2+sub3+sub4;
		double per=(total/400)*100;
		System.out.println("Percentage of a student is:"+per);
		
		
	}

}
