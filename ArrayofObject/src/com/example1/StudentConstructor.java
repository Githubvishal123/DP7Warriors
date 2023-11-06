package com.example1;

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c1 = new Course(101, "JAVA", 45000);
		Course c2 = new Course(102, ".net", 45900);

		Student2 stud[] = new Student2[4];

		stud[0] = new Student2(1, "ritu", c1);
		stud[1] = new Student2(1, "vishal", c1);
		stud[2] = new Student2(1, "akshay", c1);
		// stud[3]=new Student2(1,"arun",c1);

		stud[3] = new Student2();
		stud[3].setSid(4);
		stud[3].setName("akash");
		stud[3].setCourse(c1);

		//
		for (Student2 s : stud) {
			System.out.println(s);

		}

	}

}
