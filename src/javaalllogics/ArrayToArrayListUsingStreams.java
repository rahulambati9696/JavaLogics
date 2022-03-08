package javaalllogics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class ArrayToArrayListUsingStreams 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        List<Object> list = Arrays.stream(array).collect(Collectors.toList());
         
        System.out.println(list);
    }   
}
