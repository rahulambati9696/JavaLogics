package stringsexamples;

public class ReplaceAllExample
{  
	public static void main(String args[])
	{  
		String s1="My name is Ramu. My name is Shyam. My name is Sonu.";  
		String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  
	}
}  
