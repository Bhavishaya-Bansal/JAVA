package com.bhav.Recursion;

import java.util.ArrayList;

public class PermutationProblems {
    public static void main(String[] args) {
        // String s= "abc";
        // permutations("", s);

        // System.out.println(permutationsList("", "abc"));

        // System.out.println(permutationsCount("", "abc"));

        System.out.println(permutationsCounting("", "abcd", 0));
    }

    // String s= "abc" we have to find all the permutations possible to it.. which will be..
    // ans--> cab, cba, bac, bca, abc, acb..
    static void permutations(String pro, String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch= unPro.charAt(0);

        for(int i= 0; i< pro.length()+ 1; i++){
            String firstSubString= pro.substring(0, i);
            String secondSubString= pro.substring(i, pro.length());

            permutations(firstSubString+ ch+ secondSubString, unPro.substring(1));
        }
    }

    // Returning all the permutations in our ArrayList..
    static ArrayList<String> permutationsList(String pro, String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        char ch= unPro.charAt(0);

        ArrayList<String> ans= new ArrayList<>();

        for(int i=0; i< pro.length()+ 1; i++){
            String first= pro.substring(0, i);
            String second= pro.substring(i, pro.length());

            // Adding the permutations possible in our arrayList
            ans.addAll(permutationsList(first+ ch+ second, unPro.substring(1)));
        }
        return ans;
    }

    // Count the number of premutations possible from a given string..
    static int permutationsCount(String pro, String unPro){
        
        if(unPro.isEmpty()){
            return 1;
        }
        
        int count= 0;
        char ch= unPro.charAt(0);

        for(int i= 0; i< pro.length()+ 1; i++){
            String first= pro.substring(0, i);
            String second= pro.substring(i, pro.length());

            count= count+  permutationsCount(first+ ch+ second, unPro.substring(1));
        }
        return count;
    }

    // Passing th count variable in the recursion calls
    static int permutationsCounting(String pro, String unPro, int count){
        if(unPro.isEmpty()){
            return 1;
        }
        
        char ch= unPro.charAt(0);

        for(int i= 0; i< pro.length()+ 1; i++){
            String first= pro.substring(0, i);
            String second= pro.substring(i, pro.length());

            count= count+  permutationsCount(first+ ch+ second, unPro.substring(1));
        }
        return count;
    }

}
