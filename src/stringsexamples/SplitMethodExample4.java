package stringsexamples;

//Java program to demonstrate working of split()
public class SplitMethodExample4 {
	public static void main(String args[])
	{
		String str = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr = str.split(":");

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
