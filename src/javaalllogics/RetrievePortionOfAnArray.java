package javaalllogics;

import java.util.ArrayList;
import java.util.List;

public class RetrievePortionOfAnArray
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        list.add(555);
 
        list.add(666);
 
        System.out.println(list);     //Output : [111, 222, 333, 444, 555, 666]
 
        //Retrieving a SubList
 
        List<Integer> subList = list.subList(1, 4);
 
        System.out.println(subList);    //Output : [222, 333, 444]
 
        //Modifying the list
 
        list.set(2, 000);
 
        //Changes will be reflected in subList
 
        System.out.println(subList);    //Output : [222, 0, 444]
 
        //Modifying the subList
 
        subList.set(2, 000);
 
        //Changes will be reflected in list
 
        System.out.println(list);    //Output : [111, 222, 0, 0, 555, 666]
    }
}
