package com.bhav.Hash;

import java.util.*;

// In this prblm we are finding the path/itenary of our journey
public class ItenaryPrblm{
public static void main(String[] args) {
        HashMap<String, String> tickets= new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        path(tickets);
    }

    // Before doing anything we need to find out that from which location are we starting our journey.. for that we will reverse our hashmap and try to find the place which was not present in the destination 
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key), key); // here we have changed our key to the value part and our value as the key in the new map 
        }

        for(String key: tickets.keySet()){
            // finding the key that exists in our 'tickets' keyset but not in the reverse keySet is the starting point 
            if(!revMap.containsKey(key)){
                return key; // comparing keys for both of the hashmap.. the moment we find the key which is present in our ticket's key but not in our revMap's key we return it.. as that would be our starting point
            }
        }
        return null;
    }

    public static void path(HashMap<String, String> tickets){
        String start= getStart(tickets);
        System.out.print(start);

        for(String key: tickets.keySet()){
            System.out.print("-> "+ tickets.get(start)); // printing th next destination associated with our stat place 
            start= tickets.get(start); // updating our start to the destination of our start place i.e. the value for the start key
        }
        System.out.println();
    }
}