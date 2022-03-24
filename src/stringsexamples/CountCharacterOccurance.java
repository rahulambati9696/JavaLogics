package stringsexamples;

import java.util.Scanner;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String...");

		String name = sc.nextLine();
		String inputString = name.toUpperCase();

		System.out.println("Enter Any Character");

		char ch1 = sc.next().charAt(0);
		char ch = Character.toUpperCase(ch1);
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("The character '" + ch + "' found " + count + " times in a string '" + inputString + "'.");
	}

}