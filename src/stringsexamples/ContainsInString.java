package stringsexamples;

public class ContainsInString
{ 
	public static void main(String args[])
	{ 
		String name=" hello how are you doing"; 
		System.out.println(name.contains("how are you"));  // returns true
		System.out.println(name.contains("hello"));        // returns true  
		System.out.println(name.contains("fine"));         // returns false  
	}
}