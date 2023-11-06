package com.programs;

public class AverageNumbers {

	public static void main(String[] args) {
	float num1,num2,num3,avg;
	//because java treats 8.9 as double so it is  a lossy Compression

	num1=8.9f;
	num2=7.5f;
	num3=9.5f;
	avg=(num1+num2+num3)/3;
	System.out.println("The average of numbers is :"+avg);
	
}

}
