package javaalllogics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class SynchronizeHashSetExample 
{   
    public static void main(String[] args) 
    {
        //Creating non synchronized HashSet object
         
        HashSet<String> set = new HashSet<String>();
         
        //Adding elements to set
         
        set.add("JAVA");
         
        set.add("STRUTS");
         
        set.add("JSP");
         
        set.add("SERVLETS");
         
        set.add("JSF");
         
        //Getting synchronized set
         
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
         
        //you must use synchronized block while iterating over synchronizedSet
         
        synchronized (synchronizedSet) 
        {
            Iterator<String> it = synchronizedSet.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
    }   
}
