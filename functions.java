// import java.util.*;

// public class functions{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printMyName(name);

//     }
// }

// import java.util.*;

// public class functions{
//     public static int product(int a, int b){
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int result = product(x,y);
//         System.out.println(result);
//     }
// }

import java.util.*;

public class functions {
    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("invalid");
            return;
        } 
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
