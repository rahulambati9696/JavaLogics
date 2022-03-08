package javaalllogics;

import java.util.LinkedList;

public class GetTheLastOccuranceOfElementInLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
 
        //adding the elements to linkedList
 
        linkedList.add("AAA");
 
        linkedList.add("BBB");
 
        linkedList.add("CCC");
 
        linkedList.add("BBB");
 
        linkedList.add("FFF");
 
        linkedList.add("BBB");
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);       //Output : [AAA, BBB, CCC, BBB, FFF, BBB]
 
        //Getting the position of last occurrence of "BBB"
 
        System.out.println(linkedList.lastIndexOf("BBB"));    //Output : 5
    }
}
