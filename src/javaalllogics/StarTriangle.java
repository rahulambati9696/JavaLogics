package javaalllogics;

import java.util.Scanner;

public class StarTriangle 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any number...");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rows = a;
		System.out.println("_______________");
		for (int i = 1; i <= rows; ++i) 
		{
			for (int j = 1; j <= i; ++j) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}