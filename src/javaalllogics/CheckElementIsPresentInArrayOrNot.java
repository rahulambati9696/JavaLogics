package javaalllogics;

import java.util.ArrayList;

public class CheckElementIsPresentInArrayOrNot
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(11.11);
 
        list.add(111.111);
 
        list.add(1111.1111);
 
        //Checking whether list conatins '111.1111'
 
        System.out.println(list.contains(111.1111));    //Output : false
    }
}
