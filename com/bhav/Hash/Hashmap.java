package com.bhav.Hash;

import java.util.*;

public class Hashmap {
    public static void main(String[] args){
        // HashMap with key of string type and value of ineger type 
        HashMap<String, Integer> map = new HashMap<>();
    
        // Insertion in hashmap
        map.put("India", 125);
        map.put("US", 90);
        map.put("China", 110);
        map.put("Russia", 89);

        System.out.println(map);

        map.put("China", 130); // Here we have used a same key again which means here the value corresponding to the key will get updated and new value will be stored to the key

        System.out.println(map);

        // Search operation in hashmap 
        // we can search by two type in hashmap.. 1. 'containsKey' -> checks for the particular key  2. 'get' function -> by this we get the corresponding value for the particular key

        // Searching using 'containsKey' method -> tells if key is present or not
        if(map.containsKey("India")){
            System.out.println("Key value is present");
        }
        else{
            System.out.println("Key value does not exist.");
        }

        // Searching using 'get' method -> gives the particular value corresponding to the key
        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("Dubai")); // key does not exists

        // Iteration in hashmap
        
    }
}