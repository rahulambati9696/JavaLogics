package javaalllogics;

import java.util.ArrayList;

public class FindSizeOfArray
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(2.2);
 
        list.add(3.3);
 
        list.add(4.4);
 
        list.add(5.5);
 
        System.out.println(list);     //Output : [1.1, 2.2, 3.3, 4.4, 5.5]
 
        System.out.println("Size Of ArrayList = "+list.size());   //Output : Size Of ArrayList = 5
    }
}
