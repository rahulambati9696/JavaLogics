package stringsexamples;

//Java program to demonstrate working
//of Java.lang.String.subSequence() method
//import java.lang.Math;

public class SubSequenceExample {

	// driver code
	public static void main(String args[])
	{

		String Str = "Welcome to geeksforgeeks";

		// prints the subsequence from 0-7, exclusive 7th index
		System.out.print("Returns: ");
		System.out.println(Str.subSequence(0, 7));

		System.out.print("Returns: ");
		System.out.println(Str.subSequence(10, 24));
	}
}
