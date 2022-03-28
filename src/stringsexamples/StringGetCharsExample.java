package stringsexamples;

public class StringGetCharsExample
{  
	public static void main(String args[])
	{  
		String str = new String("hello javaprogramming how r u");  
		char[] ch = new char[15];  
		try
		{  
			str.getChars(6, 21, ch, 0);  
			System.out.println(ch);  
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}  
	}
}  
