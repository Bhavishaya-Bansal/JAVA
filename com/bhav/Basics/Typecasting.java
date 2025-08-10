package com.bhav.Basics;

import java.util.*;

// Typecasting is the process of converting the variables into different (compatible) datatypes
// This can be done in between datatypes which are of similar types such as int, float, double. String to int is not possible./

public class Typecasting {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        // Explicit typecasting
        int num= (int)(56.67);
        // System.out.println(num); // the float value will get rounded off to its int value
        
        int a= 257;
        
        // byte b= a; //will give us error as a is int and we are trying to fit it in a smaller datatype
        
        byte t= (byte)a; // to do so we would have to do explicit type casting
        
        // System.out.println(t);
        
        // Automatic typecasting- promotion in expressions
        byte x= 40;
        byte y= 50;
        byte z= 100;
        int ans= x * y / z; // here x * y would be exceeding the limit of byte and here that value would be converted in to int and then further the operations would be performed on int.

        // y= y* 2; // this would give us error as when performing up these operations the value gets converted into int format and when we later assign it to byte again it gives us error 


        // System.out.println(ans);

        // Java follows UNICODE which means that we can put any language in the java variable 

        // System.out.println("नमस्ते"); // prints the string

        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i= 7676767;
        float f= 5.67f;
        double d= 0.12345;

        double result= (f*b) +(i/c)- (d-s);
        // the above expression would be:
        // float - int - double.. which would give us double
        System.out.println(result);  // As double is of the biggest type here so we all of the values internally would be onverted into double 

        float tempC= sc.nextFloat();
        float tempF= (tempC * 9/5) + 32;
        System.out.println(tempF);


    }
}
