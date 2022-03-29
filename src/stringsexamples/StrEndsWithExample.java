package stringsexamples;

public class StrEndsWithExample
{ 
	public static void main(String args[]) 
	{
		String s1="hello how are you"; 
		System.out.println(s1.endsWith("u"));       // returns true
		System.out.println(s1.endsWith("you"));     // returns true   
		System.out.println(s1.endsWith("how")); 
		System.out.println(s1.endsWith("ou"));// returns false
	}
}