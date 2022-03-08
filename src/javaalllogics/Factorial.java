package javaalllogics;

import java.util.Scanner;

public class Factorial { 
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number"); 
		int n = sc.nextInt(); 
		int factorial=1; 
		for(int i=1;i<=n;i++) 
		{ 
			factorial= factorial*i; 
		} 
		System.out.println(factorial); 
	} 
} 
