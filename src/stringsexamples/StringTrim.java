package stringsexamples;

public class StringTrim
{  
	public static void main(String args[])
	{  
		String s1="  hello   ";  
		System.out.println(s1+"how are you");        // without trim()  
		System.out.println(s1.trim()+"how are you"); // with trim()  
	}
} 