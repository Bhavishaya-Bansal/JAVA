package com.bhav.Recursion;

public class StringProblems {
    public static void main(String[] args) {
        String s= "baccccad";
        
        skipChar("", s); // initially our prcessed string would be empty(as nothing has been processed yet and we will start processing our ans string)

        String ans= skipChar2(s);
        System.out.println(ans);        

        String str= "bccaaaappledde";
        String answer= skipString(str);
        System.out.println(answer);
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
            // if 'a' arrives send the processed String as it is and take the substring of unprocessed after skipping/forgetting/removing 1 character
            skipChar(pro, unPro.substring(1));
        }

        // Basically ' .substring ' skips the number of charaacters we send in it

        else{ // if the char is not 'a' then take that char in our processed String and again take the rest of unprocessed string(which would be the substring after skipping/forgetting/removing that 1 char)
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
            return str.charAt(0)+ skipString(str.substring(1)); // here we will decrease the size of our string by only removing the first char from our string before sending it to our recursion call as only that element should be removed 
        }
    }
}