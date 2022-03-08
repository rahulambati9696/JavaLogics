package javaalllogics;

import java.util.Scanner;

public class PrimeNumbersBetweenGivenRange 
{
    static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
         
        if(inputNumber <= 1) 
        {
            isItPrime = false;
             
            return isItPrime;
        }
        else
        {
            for (int i = 2; i <= inputNumber/2; i++) 
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;
                     
                    break;
                }
            }
             
            return isItPrime;
        }
    }
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the start value :");
         
        int start = sc.nextInt();
         
        System.out.println("Enter the end value :");
         
        int end = sc.nextInt();
         
        System.out.println("Prime numbers between "+start+" and "+end+" : ");
         
        for (int i = start; i <= end; i++) 
        {
            if(checkForPrime(i))
            {
                System.out.println(i);
            }
        }
         
        sc.close();
    }
}
