package javaalllogics;

public class PrimeNumberCount
{ 
	public static void main(String[] args) 
	{ 
		int count, c = 0; 
		for (int i = 1; i <= 1000; i++)
		{ 
			count = 0; 
			for (int j = 2; j <= i / 2; j++) 
			{ 
				if (i % j == 0) { 
					count++;
				} 
			} 
			if (count == 0) { 
				c++; 
			} 
		} 
		System.out.println(c); 
	} 
} 
