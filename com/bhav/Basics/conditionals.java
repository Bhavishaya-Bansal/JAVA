package com.bhav.Basics;

//if else:

// import java.util.*;

// public class conditionals {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("you are an adult");
//         } else {
//             System.out.println("bhaag jaa *****");
//         }
//     }
// }

// if - else if - else:

// import java.util.*;
// class first{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
        
//         if(a==1){
//             System.out.println("hello");
//         } else if (a ==2 ){
//             System.out.println("ram ram");
//         } else if(a==3){
//             System.out.println("bonjour");
//         } else{
//             System.out.println("invalid input");
//         }
//     }
// }

// switch statement: same above code in switch case format

// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         switch(a){
//             case 1:
//             System.out.println("namaste");
//             break;
//             case 2:
//             System.out.println("ram ram");
//             break;
//             case 3:
//             System.out.println("bonjour");
//             break;
//             default:
//             System.out.println("galat number");
//         } 

//     }
// }

// Calculator:

import java.util.*;
public class conditionals{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operation = sc.next();
        
        int add= a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a%b;
        
        switch(operation){
            case "+":
            System.out.print(add);
            break;
            case "-":
            System.out.println(sub);
            break;
            case "*":
            System.out.println(mul);
            break;
            case "%":
            System.out.println(div);
            break;
            default:
            System.out.println("invalid operation");
            sc.close();
        }

    }
}