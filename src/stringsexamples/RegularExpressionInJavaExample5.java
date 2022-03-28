package stringsexamples;

//Java program Illustrating Working of split() Method
//by Splitting a text by a given pattern

//Importing Matcher and Pattern classes from
//java.util.regex package
//import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
public class RegularExpressionInJavaExample5 {

	// Main driver method
	public static void main(String args[])
	{

		// Custom string
		String text = "geeks1for2geeks3";

		// Specifies the string pattern
		// which is to be searched
		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(
			delimiter, Pattern.CASE_INSENSITIVE);

		// Used to perform case insensitive search of the
		// string
		String[] result = pattern.split(text);

		// Iterating using for each loop
		for (String temp : result)
			System.out.println(temp);
	}
}
