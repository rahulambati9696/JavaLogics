package javaalllogics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
public class SynchronizeArrayListExample 
{   
    public static void main(String[] args) 
    {
        //Creating non synchronized ArrayList object
         
        ArrayList<String> list = new ArrayList<String>();
         
        //Adding elements to list
         
        list.add("JAVA");
         
        list.add("STRUTS");
         
        list.add("JSP");
         
        list.add("SERVLETS");
         
        list.add("JSF");
         
        //Getting synchronized list
         
        List<String> synchronizedList = Collections.synchronizedList(list);
         
        //you must use synchronized block while iterating over synchronizedList
         
        synchronized (synchronizedList) 
        {
            Iterator<String> it = synchronizedList.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
    }   
}
