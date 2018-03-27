import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This program demonstrates how a map (dictionary) data structure is
 * implemented in Java.
 */
public class PhoneBook {
	// Define the map
	private static Map<String, String> phoneBook = new HashMap<String, String>();
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Put some data into the map
		phoneBook.put("Alice", "1(808)772-1234");
		phoneBook.put("Bob", "1(808)772-2345");
		phoneBook.put("David", "1(808)772-3456");
		phoneBook.put("Tia", "1(808)772-4567");
		while(true) {
			System.out.println("PhoneBook Actions: (1)Search (2)Add (3)Print");
			int input = Integer.parseInt(scnr.next());
			if(input == 1) search();
			else if(input == 2) add();
			else if(input == 3) print();
		}
	}
	
	private static void search() {
		System.out.print("Search for: ");
		String key = scnr.next();
		int input;
		if(phoneBook.get(key) != null) {
			System.out.println("[" + key + "] " + phoneBook.get(key));
			System.out.println("Contact Actions: (1)Back (2)Remove");
			input = Integer.parseInt(scnr.next());
			if(input == 2) phoneBook.remove(key);
		} else {
			System.out.println("[" + key + "] can't not be found.");
			System.out.println("Contact Actions: (1)Back");
			scnr.next();
		}
	}
	
	private static void add() {
		System.out.print("Contact Name: ");
		String key = scnr.next();
		System.out.print("Contact Number: ");
		String number = scnr.next();
		phoneBook.put(key, number);
		System.out.println("[" + key + "] have been added.");
		System.out.println("Contact Actions: (1)Back");
		scnr.next();
	}

	/*
	 * Iterate through the entries in the map and print them out using the
	 * forEach() method.
	 */
	private static void print() {
		phoneBook.forEach((name, number) -> 
				System.out.println("[" + name + "]: " + number));
	}
}
