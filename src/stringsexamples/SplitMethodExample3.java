package stringsexamples;

//Java program to demonstrate working of split(regex,
//limit) with 0 limit.
public class SplitMethodExample3 {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("s", 0);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
