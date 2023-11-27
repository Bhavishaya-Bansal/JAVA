package com.bhav.Recursion;

public class Problems {
    public static void main(String[] args) {
        int n= 7;

        // print(n);

        // printRev(n);

        // both(n);

        System.out.println(fact(n));

        // int out= sum(n);
        // System.out.println(out);

        // System.out.println(sumDigits(n));
        
        // System.out.println(prod(n));
        
        // output(n);

        // reverse(n);
        // System.out.println(ans);

        // System.out.println(reverse2(n));

        // System.out.println(palindrome(n));

        // countZeroes(n);
        // System.out.println(ans);

        System.out.println(countZeroes2(n));
        
    }

    // printing from n till 1..
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    // printing from 1 till n..
    public static void printRev(int n){
        if(n==0){
            return ;
        }
        printRev(n-1); // here uptil this point the func calls keeps pushing in stack and after hitting the base condn the syso starts printing..
        System.out.println(n);
    }

    // printing from n till 1 and 1 till n..
    public static void both(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }

    // factorial of a number..
    public static int fact(int n){
        if(n<= 1){
            return 1;
        }
        int ans = n* fact(n-1);
        return ans;
    }

    // printing the sum from N till 1..
    public static int sum(int n){
        int ans= 0;
        if(n<= 1){
            return 1;
        }
        ans = n + sum(n-1);
        return ans;
    }

    // finding the sum of digits.. ex: num= 1342.. ans = 1+ 3+ 4+ 2.. that is 10..
    public static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        int rem = n% 10;
        int ans = rem + sumDigits(n/10);
        return ans;
    }

    // finding the product of the digits.. ex: num= 1942.. ans = 1*9*4*2.. that is 72
    public static int prod(int n){
        // if(n<= 1){ // we can do this.. or we can do 
        //     return 1;
        // }

        if(n%10 == n){ // if one digit is remaining, return that digit itself
            return n;
        }
        int ans= n%10 * prod(n/10);
        return ans;
    }

    // n-- vs --n
    public static void output(int n){
        if(n== 0){
            return ;
        }
        System.out.println(n);
        // output(n--); // *** error *** this will lead to infinite recursion.. as it will first the value of n in the function and then substract it 

        // but..
        output(--n);  // this will first decrease the value and then pass it
    }

    // reverse a number
    static int ans=0; // making a variable to use in our reversing of number 
    public static void reverse(int n){
        if(n== 0){
            return;
        }
        int rem = n % 10;
        ans = ans* 10+ rem;
        reverse(n/10);
    }

    // finding reverse of a number by using a base variable
    public static int reverse2(int n){
        int digits = (int)(Math.log10(n)) +1 ; // number of digits in our 'n'
        return helper(n, digits);
    }
    public static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem= n%10;
        int startingDigits = (int)(rem* Math.pow(10, digits- 1));
        int ans= startingDigits+ helper(n/10, digits-1);
        return ans;
    }

    // check if a number is palindrome or not
    public static boolean palindrome(int n){
        if(n== reverse2(n)){
            return true;
        }
        return false;
    }

    // count number of zeroes in a number using outer variable
    public static void countZeroes(int n){
        if(n==0){
            return;
        }

        int rem= n% 10;
        if(rem==0){
            ans++;
        }
        countZeroes(n/10);
    }

    // counting zeroes without using outer variable
    public static int countZeroes2(int n){
        return helper2(n, 0);
    }

    public static int helper2(int n, int count) {
        if(n==0){
            return count;
        }
        int rem= n% 10;
        if(rem == 0){
            return helper2(n/10, count+ 1);
        }
        return helper2(n/10, count);
    }


}
