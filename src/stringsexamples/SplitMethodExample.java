package stringsexamples;

//Java program to demonstrate working of split(regex,
//limit) with small limit.
public class SplitMethodExample {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
