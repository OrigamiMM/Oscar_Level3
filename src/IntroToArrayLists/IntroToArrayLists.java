package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		strings.add("Monitor");
		strings.add("Printer");
		strings.add("Mouse");
	    strings.add("keys");
		strings.add("outlet");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
		    System.out.println(s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for (String st : strings) {
			System.out.println(st);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 1) {
				String s = strings.get(i);
		    System.out.println(s);

			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for(int i= 6; i < strings.size(); i--){
			String s = strings.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		
	}
}
