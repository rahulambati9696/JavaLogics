package javaalllogics;

import java.util.Scanner;

public class SwapTwoNumber{ 
	public static void main(String[] args)
	{ 
		int a, b; 
		@SuppressWarnings("resource")
		Scanner sw = new Scanner(System.in); 
		System.out.println("The numbers are");
		
		a = sw.nextInt();   //If a=2
		b = sw.nextInt(); 	//If b=3
		a = a + b; 			//Then a = 2+3 => 5
		b = a - b; 			//Then b = 5-3 => 2
		a = a - b; 			//Then a = 5-2 => 3
		
		System.out.println("Swapping numbers are"); 
		System.out.println(a);
		System.out.println(b); 
	} 
} 
