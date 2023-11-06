//
//5.	Create arraylist of characters.
//Remove duplicate characters from the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}
//Output should be {‘d’ , ‘g’ , ‘h’}




package AdditionalAsssignments;

import java.util.ArrayList;

public class ArraylistDemoduplicate {

	static void removeduplicate(ArrayList<Character> al) {

		ArrayList<Character> al1 = new ArrayList<>();

		for (Character c : al) {

			if (!al1.contains(c)) {

				al1.add(c);

			}

		}
		al.clear();
	al.addAll(al1);
		System.out.println("The ArrayList after removing duplicates character "+al);
	}

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		al.add('d');
		al.add('g');
		al.add('h');
		al.add('d');
		al.add('d');
		al.add('h');
		al.add('g');
		removeduplicate(al);

	}

}
