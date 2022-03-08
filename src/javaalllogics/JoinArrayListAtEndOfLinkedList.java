package javaalllogics;

import java.util.ArrayList;
import java.util.LinkedList;

public class JoinArrayListAtEndOfLinkedList
{
    public static void main(String[] args)
    {
        //Creating a LinkedList
 
        LinkedList<String> linkedList = new LinkedList<String>();
 
        //Adding elements at the end of the linkedList
 
        linkedList.add("ONE");
 
        linkedList.add("TWO");
 
        linkedList.add("THREE");
 
        linkedList.add("FOUR");
 
        linkedList.add("FIVE");
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);      //Output : [ONE, TWO, THREE, FOUR, FIVE]
 
        //Creating an ArrayList
 
        ArrayList<String> arrayList = new ArrayList<String>();
 
        arrayList.add("SIX");
 
        arrayList.add("SEVEN");
 
        arrayList.add("EIGHT");
 
        arrayList.add("NINE");
 
        //Printing the elements of ArrayList
 
        System.out.println(arrayList);      //Output : [SIX, SEVEN, EIGHT, NINE]
 
        //Appending arrayList at the end of linkedList
 
        linkedList.addAll(arrayList);
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);     //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]
    }
}
