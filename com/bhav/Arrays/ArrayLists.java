package com.bhav.Arrays;

// ***** ArrayList *****

import java.util.*;

class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList of Integers 
        // ArrayList<Boolean> list2 = new ArrayList<>(); // ArrayList of Boolean
        // ArrayList<String> list3 = new ArrayList<>(); // ArrayList of Strings
        
        // Add elements in ArrayList:
        list.add(1);
        list.add(4);
        list.add(3);

        System.out.println(list);

        // Get elements in ArrayList:
        int element = list.get(0); // called on GET function by index values (here index value called is 0)

        System.out.println(element);

        // Add element in between in an ArrayList:
        list.add(1, 6); // To add elements in between first we have given here is the index on which we want to add our element and then the value we want to add on that element.

        System.out.println(list);

        // Set element: changing an already existing element:
        list.set(0, 5); // same fashion first the index is given then the element is setted

        System.out.println(list);
        
        //  Deleting an element in an ArrayList:
        list.remove(3); // index of which the value we want to remove is provided

        System.out.println(list);
        
        // Size of ArrayList:
        int size = list.size(); // size of the ArrayList is saved in integer "size"
        System.out.println(size);

        // Loops on ArrayList:
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sorting the ArrayList: the direct func:
        Collections.sort(list); // Collections is a package in java which contains multiple funcs
        System.out.println(list);
        
    }
}