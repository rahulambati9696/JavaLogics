package javaalllogics;

import java.util.Scanner;

public class StarReverseTriangle
{
	public static void main(String[] args)
	{ 
		System.out.println("Enter any number...");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("_______________");
		for (int i = 1; i <= r; i++) 
		{ 
			for (int j = r; j >= i; j--)
			{ 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
	} 
} 
