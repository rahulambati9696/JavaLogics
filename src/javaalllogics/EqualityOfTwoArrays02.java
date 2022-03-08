package javaalllogics;

import java.util.Arrays;

public class EqualityOfTwoArrays02
{
    public static void main(String[] args)
    {
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
 
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
 
        Arrays.sort(s1);
 
        Arrays.sort(s2);
 
        System.out.println(Arrays.equals(s1, s2));       //Output : true
    }
}
