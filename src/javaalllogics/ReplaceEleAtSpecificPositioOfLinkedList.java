package javaalllogics;

import java.util.LinkedList;

public class ReplaceEleAtSpecificPositioOfLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [ONE, TWO, THREE, FOUR]
 
        //Replacing an element at index 2 with "ZERO"
 
        list.set(2, "ZERO");
 
        System.out.println(list);     //Output : [ONE, TWO, ZERO, FOUR]
    }
}
