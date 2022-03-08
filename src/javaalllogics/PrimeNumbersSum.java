package javaalllogics;

import java.util.Scanner;

public class PrimeNumbersSum 
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
         
        System.out.println("Enter the value for n :");
         
        int n = sc.nextInt();
         
        int counter = 1;
         
        int sum = 0;
         
        System.out.println("The sum of first "+n+" Prime Numbers :");
         
        int inputNumber = 2;
         
        while (counter <= n)
        {
            if (checkForPrime(inputNumber))
            {
                System.out.println(inputNumber);
                 
                sum = sum + inputNumber;
                 
                counter++;
                 
                inputNumber++;
            }
            else
            {
                inputNumber++;
            }
        }
         
        System.out.println("=======");
         
        System.out.println("Sum = "+sum);
 
        sc.close();
    }
}
