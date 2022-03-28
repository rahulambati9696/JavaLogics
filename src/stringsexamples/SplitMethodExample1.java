package stringsexamples;

//Java program to demonstrate working of split(regex,
//limit) with high limit.
public class SplitMethodExample1 {
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 5);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
