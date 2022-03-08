package javaalllogics;

import java.util.ArrayList;

public class JoinTwoArrayList
{
    public static void main(String[] args)
    {   
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         
        list1.add(111);
         
        list1.add(222);
         
        list1.add(333);
         
        list1.add(444);
         
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Joining list1 and list2
         
        list1.addAll(list2);
         
        System.out.println(list1);    //Output : [111, 222, 333, 444, 555, 666, 777, 888]
    }
}
