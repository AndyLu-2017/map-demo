import java.util.*;

/**
 * This program demonstrates how a map (dictionary) data structure is
 * implemented in Java.
 */
public class MapDemo {

	public static void main(String[] args) {

		// Define the map
		Map<String, Double> gradeBook = new HashMap<String, Double>();

		// Put some data into the map
		gradeBook.put("Alice", 92.5);
		gradeBook.put("Bob", 89.2);

		/*
		 * Iterate through the entries in the map and print them out using the
		 * forEach() method.
		 *
		 * This uses a construct called a "lambda function" which is basically a
		 * function defined on the spot for one-time use without going through
		 * all of the formalities of writing a separate method.
		 */
		gradeBook.forEach((name, average) -> System.out.println(name + "'s average is " + average));

	}
}
