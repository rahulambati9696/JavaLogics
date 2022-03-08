package javaalllogics;

import java.util.LinkedList;

public class RetrieveEleFromBothEnsOfLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [FIRST, SECOND, THIRD, FOURTH, FIFTH]
 
        //Retrieving the elements from the head
 
        System.out.println(list.element());      //Output : FIRST
 
        System.out.println(list.getFirst());     //Output : FIRST
 
        System.out.println(list.peek());        //Output : FIRST
 
        System.out.println(list.peekFirst());     //Output : FIRST
 
        //Retrieving the elements from the tail
 
        System.out.println(list.peekLast());     //Output : FIFTH
 
        System.out.println(list.getLast());      //Output : FIFTH
    }
}

