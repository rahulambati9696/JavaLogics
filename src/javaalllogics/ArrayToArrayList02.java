package javaalllogics;

import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayToArrayList02 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        list.addAll(Arrays.asList(array));
         
        System.out.println(list);
    }   
}
