package javaalllogics;

import java.util.ArrayList;

public class InsertElementAtParticularPositionInArray
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
 
        //Inserting "AAA" at index 1
 
        list.add(1, "AAA");
 
        //Inserting "BBB" at index 3
 
        list.add(3, "BBB");
 
        System.out.println(list);    //Output : [ONE, AAA, TWO, BBB, THREE, FOUR]
    }
}
