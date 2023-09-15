package com.bhav.Basics;

// For loop:

// import java.util.*;

// public class loops {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(int i=1; i<=33; i++){
//             System.out.println("hello bhav");
//         }

//     }
// }

// While loop:  jab tak

// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         while(i<33){
//             System.out.println("hello semcii");
//             i++;
//         }
//         sc.close();
//     }
// }

//  Do while: do the work until the condition is reached

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         do{
//             System.out.println("hehe");
//             i++;
//         }while(i <= 4);
//         sc.close();
//     }
// }

// In do while first the work is done(even if the condition is true or false) then the condition is checked.. which means that first the program gets executed once(without knowing the condition being true or false) and further once if the condition is true it further runs..

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i= 1; i<= n ; i++){
//             System.out.println(i + (i-1));
//         }
//     }
// }

import java.util.*;

public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("---");
        for (int i= 1; i<= 10; i ++){
            System.out.println(n* i);
        }
        sc.close();
    }
}