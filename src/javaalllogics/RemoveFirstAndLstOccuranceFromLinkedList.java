package javaalllogics;

import java.util.LinkedList;

public class RemoveFirstAndLstOccuranceFromLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("J2EE");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, J2EE, JDBC]
 
        //Removing the first occurrence of "J2EE"
 
        list.removeFirstOccurrence("J2EE");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, JSP, J2EE, JDBC]
 
        //Removing the last occurrence of "J2EE"
 
        list.removeLastOccurrence("J2EE");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, JSP, JDBC]
    }
}

