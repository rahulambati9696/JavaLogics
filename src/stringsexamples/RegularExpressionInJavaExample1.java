//Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching, manipulating, and editing a string in Java. Email validation and passwords are a few areas of strings where Regex is widely used to define the constraints. Regular Expressions are provided under java.util.regex package. This consists of 3 classes and 1 interface. The java.util.regex package primarily consists of the following three classes as depicted below in tabular format as follows: 
/*S. No.	Class/Interface	Description
1.	Pattern Class	Used for defining patterns
2.	Matcher Class	Used for performing match operations on text using patterns
3.	PatternSyntaxException Class	Used for indicating syntax error in a regular expression pattern
4.	MatchResult Interface	Used for representing the result of a match operation
*/


package stringsexamples;

//Java Program Demonstrating Working of matches() Method
//Pattern class

//Importing Pattern class from java.util.regex package
import java.util.regex.Pattern;

//Main class
public class RegularExpressionInJavaExample1 {

	// Main driver method
	public static void main(String args[])
	{

		// Following line prints "true" because the whole
		// text "geeksforgeeks" matches pattern
		// "geeksforge*ks"
		System.out.println(Pattern.matches(
			"geeksforge*ks", "geeksforgeeks"));

		// Following line prints "false" because the whole
		// text "geeksfor" doesn't match pattern "g*geeks*"
		System.out.println(
			Pattern.matches("g*geeks*", "geeksfor"));
	}
}
