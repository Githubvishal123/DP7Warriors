package com.ifelse;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subj1 marks :");
		int subj1=sc.nextInt();
		System.out.println("Enter the subj2 marks :");
		int subj2=sc.nextInt();
		System.out.println("Enter the subj3 marks :");
		int subj3=sc.nextInt();
		System.out.println("Enter the subj4 marks :");
		int subj4=sc.nextInt();
		System.out.println("Enter the subj5 marks :");
		int subj5=sc.nextInt();
		double total=subj1+subj2+subj3+subj4+subj5;
		double per=(total/500)*100;
		System.out.println("percentage is"+per);
		
		if(per>36)
		{
			System.out.println("Congratulations !! passed and promoted");
		}
		else
		{
			System.out.println("Sorry u have Failed..");
			
			
		}
		
		
		
		
	}

}
