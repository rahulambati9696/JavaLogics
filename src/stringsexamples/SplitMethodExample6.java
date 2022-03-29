package stringsexamples;

public class SplitMethodExample6
{
	public static void main(String args[])
	{
		String str = "word1, word2 word3@word4?word5.word6,word7";
		String[] arrOfStr = str.split("[, ?.@]+");

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
