package javaalllogics;

import java.util.Iterator;
import java.util.LinkedList;

public class TraverseElementsInLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
        
        list.add("SQL");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]
 
        //Getting the Iterator object using descendingIterator() method
 
        Iterator<String> it = list.descendingIterator();
 
        //printing the elements of list in reverse order
 
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

