package com.bhav.Hash;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // Creating a hashset:
        HashSet<Integer> set = new HashSet<>();

        //Inserting in a HashSet
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(1); // we have added '1' here twice but as we know in sets only unique values gets stored and duplicates are ignored. Therefore, '1' will only be stored once in the formed hashset

        // Size of set:
        System.out.println("Size of set is "+ set.size());

        // Print all elements of hashset:
        System.out.println(set);

        // To search in our hashset we use a particular function called 'contains' to find out whether or not any value is contained in our hashset or not

        if(set.contains(1)){ // if '1' is present in our set then thsi if block will get executed
            System.out.println("Set contains '1' ");
        }

        if(!set.contains(6)){ // here our set.contains will return 'false' as 6 is not present in our set therefore our this if block will get executed as this is checking for this particular value does not exists
            System.out.println("Does not contains '6' ");
        }

        // Deleting in our hashSet 
        set.remove(1);

        if(!set.contains(1)){
            System.out.println("'1' has been successfully deleted");
        }

        // Iterator in set:
        Iterator it= set.iterator();

        // Iterator has 2 important functions: 1. 'hasNext' function 2. 'next' function
        // Next function directly focuses on finding the next value to the current value on which we are & the hasNext function focuses on telling that whether or not the value on which we has any value next to it or not

        // Working of iterator in hashSet:
        while(it.hasNext()){
            System.out.println(it.next() );
        } 

        // Another way to iterate in our hashset is using enhanced for loop:
        for(int value: set){
            System.out.println(value);
        }

    }
}
