//1.	Show in program, that size of an arraylist dynamically changes
//2.	Create aarraylist of integers. Add first 50 odd numbers to arraylist.
//3.	Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc) Remove elements from list for which string length is more than 7
//4.	Create arraylist of 10 integers. Insert an element at 7th position.

package AdditionalAsssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < al.size(); i++) {
			al.add(i);

			System.out.println();
		}

		System.out.println("-----------------------------------------------------------------------");

		ArrayList<Integer> al1 = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				al1.add(i);

			}

		}
		System.out.println("The first 50 odd number is ");
		System.out.println(al1);

		System.out.println("------------------------------------------------------------------------");
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Monday");
		al2.add("Tuesday");
		al2.add("Wednesday");
		al2.add("Thursday");
		al2.add("Friday");
		al2.add("Saturday");
		al2.add("Sunday");

		Iterator<String> itr = al2.iterator();

		while (itr.hasNext()) {

			String s = itr.next();

			if (s.length() > 7) {
				itr.remove();

			}

		}

		System.out.println(al2);
		System.out.println("-------------------------------------------------------------------");

		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(1);
		al3.add(2);
		al3.add(3);
		al3.add(4);
		al3.add(5);
		al3.add(6);
		al3.add(7);
		al3.add(8);
		al3.add(9);
		al3.add(10);
		for (Integer i : al) {

			System.out.println(i);

		}
		System.out.println("---------------------------------------------------------------------");
		al3.add(7, 120);

		System.out.println("Elements after inserting is " + al3);

		System.out.println("--------------------------------------------------------------");

		ArrayList<Character> al4 = new ArrayList<>();// ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’
		al4.add('d');
		al4.add('g');
		al4.add('h');
		al4.add('d');
		al4.add('d');
		al4.add('h');
		al4.add('g');

	}

}
