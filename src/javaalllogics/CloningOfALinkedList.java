package javaalllogics;

import java.util.LinkedList;

public class CloningOfALinkedList
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args)
    {
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
 
        //adding the elements to linkedList1
 
        linkedList1.add(10);
 
        linkedList1.add(20);
 
        linkedList1.add(30);
 
        linkedList1.add(40);
 
        linkedList1.add(50);
 
        //Printing the elements of linkedList1
 
        System.out.println(linkedList1);       //Output : [10, 20, 30, 40, 50]
 
        //Creating another LinkedList
 
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
 
        //Cloning the linkedList1 into linkedList2
 
        linkedList2 = (LinkedList<Integer>) linkedList1.clone();
 
        //Printing the elements of linkedList2
 
        System.out.println(linkedList2);     //Output : [10, 20, 30, 40, 50]
    }
}
