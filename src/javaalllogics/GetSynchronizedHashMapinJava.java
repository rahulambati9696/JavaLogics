package javaalllogics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
  
public class GetSynchronizedHashMapinJava 
{    
    public static void main(String[] args) 
    {
        //Creating the HashMap 
         
        HashMap<String, Integer> map = new HashMap<String, Integer>();
         
        //Getting synchronized Map
         
        @SuppressWarnings("unused")
		Map<String, Integer> syncMap = Collections.synchronizedMap(map);
    }   
}
