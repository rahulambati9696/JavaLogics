package stringsexamples;

// Java program to demonstrate working of
//String matching in Java

//Importing Matcher and Pattern class

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
public class RegularExpressionInJavaExample2 {

	// Main driver method
	public static void main(String args[])
	{

		// Create a pattern to be searched
		// Custom pattern
		Pattern pattern = Pattern.compile("geeks");

		// Search above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("geeksforgeeks.org");

		// Finding string using find() method
		while (m.find())

			// Print starting and ending indexes
			// of the pattern in the text
			// using this functionality of this class
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
	}
}
