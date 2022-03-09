package javaalllogics;

import java.util.Scanner;

public class VowelsCount 
{ 
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string without Spaces...");
		String inputString = sc.nextLine();
		
		String a = inputString;
		
		int vowels = 0; 
		int nonVowels = 0; 
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i); 
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') 
			{ 
				//vowels++;
				vowels=vowels+1;
			}
			else 
			{ 
				nonVowels++;
				//nonVowels=nonVowels+1;
			} 
		} 
		System.out.println("Count of vowels is "+vowels); 
		System.out.println("Count of Non Vowels is "+nonVowels); 
	} 
} 
