package javaalllogics;

import java.util.ArrayList;

public class RemoveAllElementsInArray
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("AAA");
 
        list.add("CCC");
 
        list.add("BBB");
 
        System.out.println(list);     //Output : [AAA, BBB, AAA, CCC, BBB]
 
        //Removing all elements of the list
 
        list.clear();
 
        System.out.println(list);    //Output : []
    }
}
