package javaalllogics;

import java.util.ArrayList;

public class RemoveGivenElementFromAnArray
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
 
        //Removing first occurrence of "AAA"
 
        list.remove("AAA");
 
        System.out.println(list);    //Output : [BBB, AAA, CCC, BBB]
 
        //Removing first occurrence of "BBB"
 
        list.remove("BBB");
 
        System.out.println(list);   //Output : [AAA, CCC, BBB]
    }
}
