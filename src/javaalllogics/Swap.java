package javaalllogics;

import java.util.Scanner;

public class Swap{ 
	public static void main(String[] args) 
	{
		int a, b, c; 
		@SuppressWarnings("resource")
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are"); 
		a = sw.nextInt(); 
		b = sw.nextInt(); 
		c = a; 
		a = b; 
		b = c; 
		System.out.println("Swapping numbers are"); 
		System.out.println(a); 
		System.out.println(b);
	} 
} 
