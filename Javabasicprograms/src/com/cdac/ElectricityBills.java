package com.cdac;
import java.util.Scanner;
public class ElectricityBills {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur Electricity Unit");
	int unit=sc.nextInt();
	
	if(unit<50)
	{
		double bill=(unit*0.5);
		 bill=bill+bill*0.2;
		System.out.println("Bill After  additional Charges are "+bill);
		
		
	}
	else if(unit<100)
	{
		double bill=(50*0.5)+(unit-50)*0.75;
		bill=bill+bill*0.2;
		System.out.println("Bill after Additional Charges are "+bill);
		
	
	}
	else if(unit<250)
	{
		double bill=(50*0.5)+(100*0.75)+(unit-150*1.2);
		bill=bill+bill*0.2;
		System.out.println("Bill After additional Charges are "+bill);
		
		
		
	} else if(unit>250)
	{
		
		double bill=(50*0.5)+(100*0.75)+(100*1.2)+((unit-250)*1.5);
		bill=bill+bill*0.2;
		System.out.println("Bill after additional charges are "+bill);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
