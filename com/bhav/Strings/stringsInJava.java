package com.bhav.Strings;

import java.util.*;


public class StringsInJava {
    public static void main(String[] args) {
        String a = "bhav";
        String b = "bhav";
        String c = a;

        System.out.println(a==b); // true because here string pool is in action and both the variables are pointing to the same object
        System.out.println(c==b); // true because of same above reason

        // how to create different objects with same value:

        String name1= new String("Bhav");
        String name2= new String("Bhav");

        System.out.println(name1 == name2); // here we are comparing the the objects, which as we have created them seperately will now not be in string pool and are created seperately

        System.out.println(name1.equals(name2)); // whereas here we are only comparing the value(by using .equals ) of both the objects (which is same) 

        System.out.println(name1.charAt(0)); // to print a particular char from String

        // PRETTY PRINTING:
        float d = 3454.4323f;
        System.out.printf("Formatted number is %.2f", d); // .2f means to print only till second decimal digit only

        System.out.println();
        
        System.out.printf("pi: %.4f", Math.PI); // this prints value of pi till 4th decimal digit

        System.out.println();
        
        System.out.printf("Hello my name is %s and I am a %s", "Bhav", "coder"); // inserting the string value by formatting them in our output
        System.out.println();
        
        // OPERATORS
        System.out.println('a' + 'b'); // the operator is converting the chars in their int value and then adding and printing the int value.
        
        System.out.println("a"+ "b"); // whereas here we are having the strings a and b being concatinated by + operator

        System.out.println((char)('a' + 6)); // converting a to int then adding 6 and the output is finally converted into char.

        System.out.println("a"+ 6); // when an integer is concatinated/added to a string the integer calls its toString method and get converted into a String (as "1") and gets concatenated to "a".

        System.out.println("Bhav"+ new ArrayList<>()); // same arrayList calls it toString method 

        System.out.println("Bhav"+ new Integer(56)); // new Int(the wrapper class of integer ) also calls its toString and gets converted into a String.

        // System.out.println(new ArrayList<>() + new Integer(56)); // This gives us error because operator '+' in java is only defined for primitives and when any one of the  values is a String. 
        System.out.println(new ArrayList<>() + " " + new Integer(56)); // This thing works because atleast one of the object types is String which provies it to convert into their toString form and concatenate them together and making the entire result to be of String type 

        // Strings are immutable in java which means String does not allow us to change their value and every time a new object is created.. String Builder helps to change their value.. therefore in StringBuilder only one object is made and the changes are made in that object only.. reference also remains the same which also does not change..
        
        //  STRING BUILDER..

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch); // it is only changing value in the existing and not creating new string every time which leads to save in memory 
        } 
        System.out.println(builder);

        // Here if we will perform this above operation with 'Strings' then we will end up having a lot of extra space Strings to whom no pointer will be pointing and they would end up taking extra space.. Ex: Here extra "a", "ab", "abc" till "abc..y" will be formed.. which will form object which are not pointed by any refrence variable and end up taking extra memory..

        // String METHODS..

        String named= "Bhavishaya Bansal";
        
        // toCharArray: convert string to a char array..
        char named1[]= named.toCharArray();
        
        for(int i= 0; i< named1.length; i++){
            System.out.println(named1[i]);
        }
        
        System.out.println(Arrays.toString(named1));

        // the above is same as the below given line..
        System.out.println(Arrays.toString(named.toCharArray()));

        // make the String to lower case
        System.out.println(named.toLowerCase());

        // .strip removes the white space at the end and front.. same ways the trim works
        System.out.println("         Bhav    yb     ".strip());
        System.out.println("         Bhav    h    ".trim());

        // .split will split the string into array everytime a space is found as elements of the array
        System.out.println(Arrays.toString(named.split(" ")));


        // Remove whitespaces..
        String sentence= "hi   I   am   Bhav   .";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // Split the string..

        String nameList= "Bhav Ram Shyam Abhay Hima";

        // we can split it across spaces, commas, full-stops or anything..
        String names[]= nameList.split(" ");
        System.out.println(Arrays.toString(names));       

    }
}