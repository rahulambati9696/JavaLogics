package stringsexamples;

//Java program to demonstrate working of
//String matching in Java

//Importing Matcher and Pattern class
//from java.util package
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
public class RegularExpressionInJavaExample3 {

	// Main driver method
	public static void main(String args[])
	{

		// Creating a pattern to be searched
		// Custom pattern to be searched
		Pattern pattern = Pattern.compile("ge*");

		// Searching for the above pattern in
		// "geeksforgeeks.org"
		Matcher m = pattern.matcher("geeksforgeeks.org");

		// Checking whether the pattern is there or not
		// using find() method
		while (m.find())

			// Print starting and ending indexes of the
			// pattern in text using method functionality of
			// this class
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
	}
}
