package com.bhav.Hash;

import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        lhs.add("india");
        lhs.add("mumbai");
        lhs.add("delhi");
        lhs.add("punjab");
        lhs.add("haryana");
        lhs.add("spain");

        System.out.println(lhs); // order is maintained while printing our hashset

        HashSet<String> set= new HashSet<>();
        set.add("india");
        set.add("mumbai");
        set.add("delhi");
        set.add("punjab");
        set.add("haryana");
        set.add("spain");

        System.out.println(set); // unordered in nature

        TreeSet<String> tset= new TreeSet<>();
        tset.add("mumbai");
        tset.add("delhi");
        tset.add("india");
        tset.add("iraq");
        tset.add("haryana");
        tset.add("spain");

        System.out.println(tset); // Sorted in ascending order

    }
}
