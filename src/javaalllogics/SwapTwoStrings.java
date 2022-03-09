package javaalllogics;


import java.util.Scanner;
 
public class SwapTwoStrings 
{  
    public static void main(String[] args) 
    {   
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter First String :");
         
        String s1 = sc.next();							// s1 = java
         
        System.out.println("Enter Second String :");
         
        String s2 = sc.next();							// s2 = Hello
         	
        System.out.println("Before Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
         
        //Swapping starts
         
        s1 = s1 + s2;									// s1 = JavaHello 
         
        s2 = s1.substring(0, s1.length()-s2.length());	// s2 = s1.substring(0, 9-5); => s2 = s1.substring(0,4); => s2 = java
         
        s1 = s1.substring(s2.length());					// s1 = s1.substring(4); => s1 = Hello
         
        //Swapping ends
         
        System.out.println("After Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
    }   
}

