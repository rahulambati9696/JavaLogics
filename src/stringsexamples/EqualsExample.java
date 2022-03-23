package stringsexamples;

public class EqualsExample
{ 
	public static void main(String args[])
	{ 
		String s1="hello"; 
		String s2="hello"; 
		String s3="hi";
		System.out.println(s1.equals(s2));   // returns true
		System.out.println(s1.equals(s3));   // returns false
	}
}