package com.ArrayofContainment;
import java.util.Arrays;
public class StudentConstructor2 {

	public static void main(String[] args) {
		
		Student2 stud[]=new Student2[4];
		
		stud[0]=new Student2(1,"akshay",new Course(101,"java",34000));
		stud[1]=new Student2(2,"vishal",new Course(102,".net",30000));
		stud[2]=new Student2(3,"anuj",new Course(103,".net",40000));
		
		//hard code getter and setter
		
		stud[3]=new Student2();
		stud[3].setSid(4);
		stud[3].setName("pratik");
		stud[3].setCourse(new Course(101,"java",34000));
		
		for(Student2 s:stud)
		{
			
			System.out.println(s);
			
		}
		
		System.out.println(Arrays.toString(stud));
		
	}

}
