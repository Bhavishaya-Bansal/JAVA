import java.util.*;

class practise{
    public static void main(String args[]){
        int a =5;
        int b= 7;
        
        // to find a number is even or odd using bits
        if((a&1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        // swapping two numbers

        a= a^b;
        b= a^b;
        a= a^b;

        System.out.println(a + " " + b);
    }
}