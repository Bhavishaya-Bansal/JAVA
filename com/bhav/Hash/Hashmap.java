package com.bhav.Hash;

import java.util.*;

public class Hashmap {
    public static void main(String[] args){
        // HashMap with key of string type and value of integer type 
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
        // iteration can be using enhanced for loop
        // just like-->  for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration method to only get our Keys
        // here we have made a set of String type of name 'keys' and used func keySet which makes set only of our keys
        Set<String> keys= map.keySet();
        // for loop to print it
        for(String key : keys){
            System.out.println(key+ " "+ map.get(key));
                            // prints key..   this prints value corresponding to key in our pair
        }

        // how to remove a pair in our map
        // we use 'remove' keyword.. it removes both key and value from our map 

        map.remove("China"); // China key and value gets removed 
        System.out.println(map);

    }
}