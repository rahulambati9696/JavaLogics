package javaalllogics;

import java.util.Scanner;

public class SumOfOdd
{ 
	public static void main(String[] args)
	{ 
		int oddCount = 0,evenCount=0; 
		
		System.out.println("Enter any number...");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		for (int i = 1; i <= a; i++) 
		{ 
			if (i % 2 == 1)
			{ 
				oddCount= oddCount + i; 
			} 
			else
			{ 
				evenCount=evenCount+i; 
			} 
		} 
		System.out.println("Count of odd number is "+oddCount);
		System.out.println("Count of even number is "+evenCount);
	} 
} 
