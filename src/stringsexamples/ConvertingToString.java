package stringsexamples;

//Java String ValueOf(): This method converts different types of values into string.
//The signature or syntax of string valueOf() method is given below:
//public static String valueOf(boolean b)
//public static String valueOf(char c)
//public static String valueOf(char[] c)
//public static String valueOf(int i)
//public static String valueOf(long l)
//public static String valueOf(float f)
//public static String valueOf(double d)
//public static String valueOf(Object o)

public class ConvertingToString
{
	public static void main(String args[])
	{
		int v1=20; 
		String s1=String.valueOf(v1);
		System.out.println(s1+'_'+17);       //concatenating string with 10 
		
		float v2=2.5f;
		String s2=String.valueOf(v2);
		System.out.println(s2+'_'+17); 
		
		char v3='a';
		String s3=String.valueOf(v3); 
		System.out.println(s3+'_'+17); 
		
		long v4=984384748;
		String s4=String.valueOf(v4); 
		System.out.println(s4+'_'+17); 
		
		double v5=373.73737388387;
		String s5=String.valueOf(v5);
		System.out.println(s5+'_'+17); 
		
		@SuppressWarnings("unused")
		Object objStr = v1;
		System.out.println(s1.endsWith("0"));
//		Object obj = v1;
//		String s1=String.valueOf(v1);
//		System.out.println(s1+'_'+17);
	}
}