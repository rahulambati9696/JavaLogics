package javaalllogics;

import java.util.LinkedList;

public class LinkedListAsStack
{
    public static void main(String[] args)
    {
        LinkedList<Integer> stack = new LinkedList<Integer>();
 
        //pushing the elements into the stack
 
        stack.push(10);
 
        stack.push(20);
 
        stack.push(30);
 
        stack.push(40);
 
        //Printing the elements of stack
 
        System.out.println(stack);      //Output : [40, 30, 20, 10]
 
        //Poping out the elements from the stack
 
        System.out.println(stack.pop());    //Output : 40
 
        System.out.println(stack.pop());    //Output : 30
    }
}
