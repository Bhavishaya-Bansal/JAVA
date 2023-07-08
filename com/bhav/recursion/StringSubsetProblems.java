package com.bhav.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSubsetProblems {
    public static void main(String[] args) {
        String s= "baccccad";
        
        // skipChar("", s); // initially our prcessed string would be empty(as nothing has been processed yet and we will start processing our ans string)

        String ans= skipChar2(s);
        // System.out.println(ans);        

        String str= "bccaaaappledde";
        String answer= skipString(str);
        // System.out.println(answer);

        String original= "baccaaapplejdfg"; // "apple" is present here
        String original2= "bcappluhfs"; // "apple" is not present here
        String toRemove= "app";
        String dontRemoveIfPresent= "apple";

        String output= skipCertainNotWhole(original, toRemove, dontRemoveIfPresent);
        String output2= skipCertainNotWhole(original2, toRemove, dontRemoveIfPresent);

        // System.out.println(output); // "app" does not get removed
        // System.out.println(output2); // "app" does get removed

        // subseq("", "abc"); // intially our pro will be empty!

        // System.out.println(subSeqList("", "abc"));
        
        // int value = ASCII('a');
        // System.out.println(value);

        // subSeqAscii("", "abc");

        // System.out.println(subSeqAcsiiList("", "abc"));

        int arr[] = {1, 2, 3};
        List<List<Integer>> subset= subSets(arr);
        System.out.println(subset);

    }

    // Method 1 of skipping a character in a string and printing a new string: by using a processed and an unprocessed string.. ex: string= "bacccad".. remove char 'a' then our ans will be "bcccd".. here our processed string is the ans string which is being processed everytime we do our recursion call and unprocessed string is the original string from which we are taking our char and forming the new string
    public static void skipChar(String pro, String unPro){
        // Base case
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        // first char in every func call
        char ch= unPro.charAt(0);

        if(ch == 'a'){ 
            // if 'a' arrives send the processed String as it is and take the substring from 1st character till the end 
            skipChar(pro, unPro.substring(1));
        }

        // Basically ' .substring ' skips the number of charaacters we send in it

        else{ // if the char is not 'a' then take that char in our processed String and again take the rest of unprocessed string(which would be the substring from 1st char till the end)
            skipChar(pro+ ch, unPro.substring(1));
        }
    }

    // Method 2 of skipping a character in a string and printing a new string: here we will return a string 
    public static String skipChar2(String s){
        if(s.isEmpty()){
            return ""; // return the empty string
        }

        char ch= s.charAt(0); // checking for the char that is currently present at 0th index..
        
        if(ch== 'a'){
            return skipChar2(s.substring(1)); // if our char is equal to 'a' it means that we dont have to send it with our string 
        }

        else{ // else we will add our char in our string
            return ch+ skipChar2(s.substring(1));
        }
    }

    // Skip a String.. suppose we want to skip the String: "apple"
    public static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }

        // checking if our string start with "apple"..
        if(str.startsWith("apple")){ // if it is "apple" then skip it
            return skipString(str.substring(5));
        }

        else{ // if our string does not starts with "apple" then take the first character plus run recursion for the remaining substring
            return str.charAt(0)+ skipString(str.substring(1)); // here we will decrease the size of our string by only sending our string from 1st index till end before sending it to our recursion call as only that element should be removed 
        }
    }

    public static String skipCertainNotWhole(String str, String toRemove, String dontRemoveIfPresent){
        // Base case
        if(str.isEmpty()){ // here str is our original string
            return "";
        }

        if(str.startsWith(toRemove) && !str.startsWith(dontRemoveIfPresent)){
            return skipCertainNotWhole(str.substring(3), toRemove, dontRemoveIfPresent);
        }

        else{
            return str.charAt(0) + skipCertainNotWhole(str.substring(1), toRemove, dontRemoveIfPresent);
        }
    }


    // **** SUBSEQUENCE IN STRINGS.. ****
    // if the str is str= "abc" then all the possible subsequence will be "a", "ab", "ac", "abc", "b", "bc", "c".. 

    // Using the processed and unprocessed strings in recursion 
    public static void subseq(String pro, String unPro){
        // Base case:
        if(unPro.isEmpty()){ // whenever unPor is empty print the processed one and return 
            System.out.println(pro);
            return;
        }

        // Take the first char.. 
        char ch= unPro.charAt(0); 

        subseq(pro+ ch, unPro.substring(1)); // Add the character in our answer string subsequences
        subseq(pro, unPro.substring(1)); // Ignore the character in our answer string subsequences
    }

    // Return Arraylist of String for all of the subsequences of a string
    public static ArrayList<String> subSeqList(String pro, String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        char ch= unPro.charAt(0);

        ArrayList<String> left= subSeqList(pro+ ch, unPro.substring(1));
        ArrayList<String> right= subSeqList(pro, unPro.substring(1));

        left.addAll(right);
        return left; // we can return any one of them either left or right, becuase both would be same
    }

    // **** ASCII value of any char can be found by.. ****
    public static int ASCII(char ch){
        return (ch+ 0); // Just add the char with 0, this will convert it into int
    }

    // Return subsequences with ASCII values 
    public static void subSeqAscii(String pro, String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch= unPro.charAt(0);

        subSeqAscii(pro+ ch, unPro.substring(1)); // sending in recursive call, the one where we are taking the char
        subSeqAscii(pro, unPro.substring(1)); // sending in recursive call, the one where we are not taking the char
        subSeqAscii(pro+ (ch+0), unPro.substring(1)); // sending in recursive call. the one where we are sending the ascii value
    }

    // Return subsequnce with ascii values in an ArrayList
    public static ArrayList<String> subSeqAcsiiList(String pro, String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        char ch= unPro.charAt(0);

        ArrayList<String> withChar= subSeqAcsiiList(pro+ ch, unPro.substring(1));
        ArrayList<String> withoutChar= subSeqAcsiiList(pro, unPro.substring(1));
        ArrayList<String> withAscii= subSeqAcsiiList(pro + (ch+0), unPro.substring(1));

        withChar.addAll(withoutChar);
        withChar.addAll(withAscii);

        return withChar;
    }

    // *** Finding all the subsets(subsets are called in arrays) using ITERATION.. ***
    public static List<List<Integer>> subSets(int arr[]){
        List<List<Integer>> outerList= new ArrayList<>();
        
        outerList.add(new ArrayList<>()); // Initially our outer arraylist will have an empty arraylist 

        // at every step we need to double the size of our outer list by adding the same number of internal lists present in it just one step back in the loop.. and we also need to copy the list element from old half to the new half and then append the rest of the new elements in the new half
        for(int num: arr){
            int n= outerList.size(); // storing size of outer list
            for(int i=0; i< n; i++){
                List<Integer> internalList = new ArrayList<>(outerList.get(i)); // outerList.get(i) makes the internal List a copy of the outer List 
                internalList.add(num); // adding the number into our internal list 
                outerList.add(internalList); // adding the internal list to our outer list so that in next step of for loop new elements can also be used (individual list is getting added into the main list) 
            }
        }
        return outerList;
    }

    // Subsets when duplicate elements are present in the array.. Ex: array= {1, 2, 2};
    // Here whenever we will find a duplicate element, we will only add it to newly added subsets of previous step.. as we are doing this it is only possible when the duplicates are at adjacent positions.. if duplicate elements are not at the adjacent positions then this will not work..
    public static List<List<Integer>> duplicateSubsets(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> outerList= new Arraylist<>();
        
        for(int num: arr){
            int n= outerList.size();
            for(int i=0; i< n; i++){
                List<Integer> internalList= new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }

    }
}
