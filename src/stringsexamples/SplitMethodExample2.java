package stringsexamples;

//Java program to demonstrate working of split(regex,
//limit) with negative limit.
public class SplitMethodExample2 {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", -2);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
