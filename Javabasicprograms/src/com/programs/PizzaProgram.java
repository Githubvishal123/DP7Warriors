package com.programs;
import java.util.Scanner;
public class PizzaProgram {

	public static void main(String[] args) {
	

		System.out.println("Generating the bill.....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pizza bought :");
		 double pizza=sc.nextDouble();
		System.out.println("Enter the number of puffs :");
		double puffs=sc.nextDouble();
		System.out.println("Enter the number os colddrink");
		double colddrinks=sc.nextDouble();
		
		System.out.println("total price of pizza:"+(pizza*100));
		System.out.println("Total price of puffs:"+(puffs*10));
		System.out.println("Toatal price of colddrinks :"+(colddrinks*20));
		
		System.out.println("Total amount :"+(pizza*100)+ +(puffs*10)+ +(colddrinks*20));
		System.out.println("Enjoy the Show!!");
		

	
		
	}

}
