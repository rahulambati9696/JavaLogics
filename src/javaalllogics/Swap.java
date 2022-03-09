package javaalllogics;

import java.util.Scanner;

public class Swap{ 
	public static void main(String[] args) 
	{
		int a, b, c; 
		@SuppressWarnings("resource")
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are"); 
		
		a = sw.nextInt(); 		//If a = 2
		b = sw.nextInt(); 		//If b = 3
		c = a; 					//Then c = 2
		a = b; 					//Then a = 3
		b = c; 					//Then b = 2
		
		System.out.println("Swapping numbers are"); 
		System.out.println(a); 
		System.out.println(b);
	} 
} 
