package javaalllogics;

import java.util.ArrayList;

public class RemoveElementFromAnArray
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("ccc");
 
        list.add("DDD");
 
        list.add("e");
 
        System.out.println(list);     //Output : [AAA, BBB, ccc, DDD, e]
 
        //Removing an element from position 2
 
        list.remove(2);
 
        System.out.println(list);    //Output : [AAA, BBB, DDD, e]
 
        //Removing an element from position 3
 
        list.remove(3);
 
        System.out.println(list);   //Output : [AAA, BBB, DDD]
    }
}
