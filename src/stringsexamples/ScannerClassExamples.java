package stringsexamples;

//Java program to read data of various types using Scanner class.
import java.util.Scanner;

public class ScannerClassExamples
{
	public static void main(String[] args)
	{
		// Declare the object and initialize with
		// predefined standard input object
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name...");
		// String input
		String name = sc.nextLine();
		System.out.println("Enter Gender...");

		// Character input
		char gender = sc.next().charAt(0);
		System.out.println("Enter Age...");

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		int age = sc.nextInt();
		System.out.println("Enter Mobile Number...");

		long mobileNo = sc.nextLong();
		System.out.println("Enter CGPA...");

		double cgpa = sc.nextDouble();

		// Print the values to check if the input was correctly obtained.
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
	}
}
