package stringsexamples;

//Java Program Demonstrating Working of String matching

//Importing Matcher class and Pattern classes
//from java.util.regex package
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
public class RegularExpressionInJavaExample4 {

	// Main driver method
	public static void main(String args[])
	{

		// Creating a pattern to be searched
		Pattern pattern = Pattern.compile(
			"ge*", Pattern.CASE_INSENSITIVE);

		// Searching above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("GeeksforGeeks.org");

		// Find th above string using find() method
		while (m.find())

			// Printing the starting and ending indexes of
			// the pattern in text using class method
			// functionalities
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
	}
}
