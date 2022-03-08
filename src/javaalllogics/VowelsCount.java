package javaalllogics;

public class VowelsCount 
{ 
	public static void main(String[] args) 
	{
		String a = "welcome"; 
		int vowels = 0; 
		int nonVowels = 0; 
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i); 
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') { 
				vowels++; 
			}
			else { 
				nonVowels++; 
			} 
		} 
		System.out.println("Count of vowels is "+vowels); 
		System.out.println("Count of Non Vowels is "+nonVowels); 
	} 
} 
