package com.bhav.Oops6.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student bhav= new Student(11, 88.76f);
        Student karan= new Student(5, 99.33f);
        Student ram= new Student(2, 23.44f);
        Student shyam= new Student(13, 95.78f);
        Student kiran= new Student(45, 100.00f);

        // if(bhav > karan){ 
            // ***error*** bcs java will not be able to know that which one type is meant to be compared as there are 2 different types in each object.. to solve this problem we have to implent 'Comparable' AND tthis is also not the conventional way to wirte it the correct method is given below

        //     System.out.println("bhav has more marks.");
        // }
        Student list[]= {bhav, karan, ram, shyam, kiran};
        
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        // if(bhav.compareTo(karan)<0){
        //     System.out.println("karan has more marks");
        //     System.out.println(bhav.compareTo(karan));
        // }

    }
}
