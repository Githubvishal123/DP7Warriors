package com.arrayassignments;
import java.util.ArrayList;
import java.util.Iterator;

public class PrintAlternateNo {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(8);
		al.add(10);
		
		
		for(int i=0;i<al.size();i=i+2)
		{
			
			System.out.println(al.get(i));
			
		}
		System.out.println("----------------------");
		
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Integer num=itr.next();
			if(itr.hasNext())itr.next();
			{
				
				System.out.println(num);
			}
			
			
			
		}
		
//		for(int i=1;i<=50;i=i+2)
//		{
//			al.add(i);
//			
//			
//		}
//		
//		System.out.println(al);
//		
//		
		
		

	}

}
