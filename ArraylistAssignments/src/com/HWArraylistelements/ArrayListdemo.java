
package com.HWArraylistelements;
//6.	WAP to use add all elements to ArrayList

//7.	WAP to sort a given ArrayList

//8.	WAP to copy one ArrayList into another
//9.	WAP to compare two ArrayLists print if equal?
//10.	WAP to join two ArrayLists
//11.	WAP to clone an ArrayList to another ArrayList
//12.	WAP to empty an ArrayList
//13.	WAP to trim the capacity of an ArrayList the current list size
//14.	WAP to increase the size of an ArrayList
//15.	WAP to update specific array element by given element
//16.	WAP to remove the third element from an ArrayList
//17.	WAP to shuffle elements in an ArrayList
//18.	WAP to reverse elements in an ArrayList
//19.	WAP to extract a portion of an ArrayList
//20.	WAP to print all the elements of an ArrayList using the position of the elements

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(1);
		al.add(2);

		for (Integer i : al)// it maintains insertion order
		{
			System.out.println(i);

		}

		System.out.println("-----------------------------------------------------------");

		Collections.sort(al);

		System.out.println(al);

		System.out.println("------------------------------------------------------------------");
		List<Integer> al1 = new ArrayList<>(al);
		al1.add(100);
		al1.add(120);

		for (Integer i : al1) {
			System.out.println(i);

		}

		System.out.println("--------------------------------------------------------------------");

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Mango");
		al2.add("Banana");

		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Mango");
		al3.add("Banana");

		boolean status = al2.equals(al3);// it will return true if equal otherwise false

		if (status == true) {
			System.out.println("Both ArrayList are equal");

		} else {
			System.out.println("Both ArrayList are  not equal");

		}

		System.out.println("--------------------------------------------------------------------------");
		ArrayList<Integer> al4 = new ArrayList<>();
		al4.add(5);
		al4.add(10);
		al4.add(1);

		ArrayList<Integer> al5 = new ArrayList<>();
		al5.add(3);
		al5.add(2);
		al5.add(7);

		al4.addAll(al5);// it will add all elements of Arraylist al5 and using add all methods we can
						// join two different arraylist

		System.out.println("-------------------------------------------------------------------------");
		System.out.println(al4);

		ArrayList<String> al6 = new ArrayList<>();
		al6.add("Akshay");
		al6.add("Anuj");
		al6.add("Kailash");

		ArrayList<String> al7 = new ArrayList<>(al6);// we are cloning the arraylist
		System.out.println(al7);

		System.out.println("--------------------------------------------------------------------------");

		ArrayList<String> al8 = new ArrayList<>();
		al8.add("Vishal");
		al8.add("Anuj");

		al8.clear();
		System.out.println("The list after removing element " + al8);
		System.out.println("--------------------------------------------------------------------------");
		ArrayList<Integer> al9 = new ArrayList<>();
		al9.add(4);
		al9.add(10);
		al9.add(5);

		al9.trimToSize();// it will trim the capacity of arraylist means it will reduce the size of
							// arraylist for ex size of arraylist is 10 and after trim the size of arraylist
							// reduces to 5

		System.out.println(al9);
		System.out.println("------------------------------------------");

		ArrayList<Integer> al10 = new ArrayList<>();
		al10.add(4);
		al10.add(11);
		al10.add(5);

		System.out.println(al10);
		al10.add(7);
		al10.add(2);

		System.out.println("It will autoatically increase it size when element is added" + al10);

		ArrayList<String> al11 = new ArrayList<>();
		al11.add("Vishal");
		al11.add("Anuj");
		al11.add("Kailash");

		al11.set(1, "Akshay");
		System.out.println("After adding specified array element ");
		System.out.println(al11);

		System.out.println("-------------------------------------------------------------");
		ArrayList<String> al12 = new ArrayList<>();
		al12.add("Mango");
		al12.add("Banana");
		al12.add("Apple");
		al12.add("Cherry");

		al12.remove(3);// remove method removes the specified element in the list
		System.out.println(al12);
		System.out.println("------------------------------------------------------------");

		Collections.shuffle(al12);// it will randomely shuffle the elemment

		System.out.println(al12);

		Collections.reverse(al12);// it will reverse the list
		System.out.println("--------------------------------------------------------------");
		System.out.println(al12);

		System.out.println("------------------------------------------------------------------");
		List<String> portion = al12.subList(0, 2);
		System.out.println(portion);

		for (int i = 0; i < al12.size(); i++) {

			System.out.println("The elements present at position " + i + " is " + al12.get(i));

		}

	}

}
