package com.cdac;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur stream ");
		String stream=sc.next();
		System.out.println("Enter ur passingCritieria");
		int pc=sc.nextInt();
		
		
		switch(stream)
		{
		case "MBA": System.out.println("Congrats!! ur are eligible for MBA Course ");
		switch(pc)
		{
		
		case 75:System.out.println("for 75% MBA course is Available");
		break;
		case 70:System.out.println("for 70% MCA course is Available");
		break;
		
		default:System.out.println("you are not eligible for Course");
		break;
		}
		
		
		break;
		case "MCA":System.out.println("Congrats u are eligible for MCA Course");
		switch(pc)
		{
		
		case 75:System.out.println("for 75% MBA course is Available");
		break;
		case 70:System.out.println("for 70% MCA course is Available");
		break;
		
		default:System.out.println("you are not eligible for Course");
		break;
		}
		
		break;
		
		
		
		
		
		
		default:System.out.println("Enter Correct Stream");
		}
		
		
	}
		
		
	}	

	


