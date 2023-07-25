package com.bhav.Hash;

import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmap= new LinkedHashMap<>();
        lmap.put("India", 199);
        lmap.put("China", 499);
        lmap.put("US", 299);
        lmap.put("Canada", 399);

        System.out.println(lmap); // here the key-value pair will be printed in same order as in the order in which it was inserted

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 199);
        map.put("China", 499);
        map.put("US", 299);
        map.put("Canada", 399);

        System.out.println(map); // here the key-value pair will not be printed in the same manner in which they were inserted 
    }
}
