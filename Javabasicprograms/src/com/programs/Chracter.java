package com.programs;
import java.util.Scanner;
public class Chracter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character :");
		char c=sc.next().charAt(0);
		if((c>='A' && c<='Z') ||(c>='a' && c<='z'))
		{
			System.out.println("It is a  Character");
			
		}
		else if(c>=0 &&c<=9) {
			
			System.out.println("It is a Digit");
		}
		
		else
		{
			System.out.println("It is a Special Character");
			
		}
		sc.close();
		
	}

}
