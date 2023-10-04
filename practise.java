package com.bhav.Strings;

import java.util.*;
import java.text.DecimalFormat;

public class Practise {
    public static void main(String[] args) {
        // String Buffer constructor type 1.. Created an object of type StringBuffer.. creates an empty string buffer
        StringBuffer sb= new StringBuffer();
        sb.append("I am Bhav.");
        
        String str= sb.toString();
        System.out.println(str);

        // String Buffer constructor type 2.. when we give in a string while creating our string buffer object..
        StringBuffer sb2= new StringBuffer("Bhavishaya Bansal");

        // String Buffer constructor type 3.. here we can specify the capacity of our string buffer object initially..
        StringBuffer sb3= new StringBuffer(30);  // 30 is the capacity here of the string buffer

        // some operations..
        sb2.append(" is nice.");
        System.out.println(sb2);

        sb.append(" Hi there.");
        System.out.println(sb);
        
        sb.replace(5, 9, "Ram");
        System.out.println(sb);

        sb2.delete(4, 10);
        System.out.println(sb2);

        sb2.reverse();
        System.out.println(sb2);

        // Creating a random string of the size that will be given by the user..
        int n= 20;
        String name= RandomString.generate(n);
        System.out.println(name);

        // Rounding off..
        DecimalFormat df= new DecimalFormat("00.0000");
        System.out.println(df.format(7.29)); 

    }
}
