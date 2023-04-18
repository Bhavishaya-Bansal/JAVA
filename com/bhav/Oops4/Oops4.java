package com.bhav.Oops4;

import java.util.*;
public class Oops4 {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers(10, "Bhav");
        // obj.num; // ****error**** whenever the int is private we cannot access it outside its own class. 
        // Public means we can access it anywhere. 
        // Default means that we can access it in the same package only.

        // We cannot access it like this, for these to access we have to use getters and setters
        obj.getNum();
         
        
    }    
}