package javaalllogics;

import java.util.Scanner;

public class SumOfDigits
{ 
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number");
		int n = sc.nextInt(); 
		int a,i=0,j=0; 
		a=n; 
		while(a>0) 
		{ 
			i=a%10; 
			j=j+i; 
			a=a/10;
		} 
		System.out.println("Sum of the digits "+j);
	} 
} 
