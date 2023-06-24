public class BitManipulation {
    public static void main(String[] args) {
        int n= 3;
        int base= 3;
        int power = 6;
        int arr[]= {1, 3, 1, 1, 5, 2, 5, 5, 3, 3};

        // evenOdd(n);

        // int solution = unique(arr);
        // System.out.println(solution);

        // int soln= theBit(17, 1);
        // System.out.println(soln);

        // int solu= setBit(17, 2);
        // System.out.println(solu);

        // int sols= resetBit(17, 1);
        // System.out.println(sols);

        // int aans= once(arr);
        // System.out.println(aans);

        // int out= magic(n);
        // System.out.println(out);

        // int output= digitsInBase(n);
        // System.out.println(output);

        // int digit= digitsInBaseFormula(n, 10);
        // System.out.println(digit);

        // int pass= pascal(n);
        // System.out.println(pass);

        // System.out.println(power(n));

        int powerIs = aToB(base, power);
        System.out.println(powerIs);
    }

    public static void evenOdd(int n){
        int ans= n & 1;
        if(ans==1){
            System.out.println("odd");
        }
        else{ 
            System.out.println("even");
        }
    }

    // find unique element in the array.. ex: arr[]= {1, 3, 2, 5, 5, 1, 3}.. here unique = 2
    public static int unique(int arr[]){
        int ans=0; 
        for(int nums: arr){
            ans= ans^ nums; // here we are doing XOR of all the elements present in our arr.. as XOR of same numbers will give 0 and the unique element in the last will be left
        }
        return ans;
    }

    // find i'th bit of a number
    public static int theBit(int n, int i){
        n = n& (1<<(i-1));
        n= n>>(i-1);
        return n;
    }

    // set the i'th bit.. if the bit is 0 make 1.. if the bit 1 let it be 1
    public static int setBit(int n, int i){
        n= n | (1<< (i-1)); // getting the AND of the particular posn will set the bit to 1
        return n;
    }

    // reset the i'th bit.. if the bit is 1 make it 0.. if the bit is 0 let it be 0
    public static int resetBit(int n, int i){
        i= 1<< (i-1); // taking our 1 to the posn where we have to make changes 
        i = ~i; // taking complement of the number to make the posn 0 
        n= n& i;
        return n;
    }

    // find the posn of the right most set bit
    

    // every number is appearing 3 times in an array, find the number appearing once..
    // public static int once(int arr[]){ // here as every number is appearing three times therefore their bits are also appearing thrice.. so can take the modulo of the bits with '3' and the remainder of that would give us the number which is appearing once
        
    // }


    // *** MAGIC NUMBER *** -> the number is written in binary but is multiplied in power of 5.. 5^1, 5^2, 5^3 and so on...

    // Magic number:      5^3  5^2  5^1
    //                1 -> 0    0    1  -> 5
    //                2 -> 0    1    0  -> 25
    //                3 -> 0    1    1  -> 30 (5+25)
    //                4 -> 1    0    0  -> 125
    //                5 -> 1    0    1  -> 130 (125 +5)
        
    // Find the n'th magic number..
    public static int magic(int n){
        int ans=0;
        int base= 5; 
        while(n>0){
            int lastDigit= n & 1; // last digit in binary our of our nmbr
            n = n>>1; // right shift to remove the last digit 
            ans= ans + (lastDigit * base);
            base = base* 5;
        }
        return ans;
    }

    // find number of digits in base b..
    // 6 in decimal form has 1 digit and 6 in binary form has 3 digits (110 -> 6 in binary)
    public static int digitsInBase(int n){
        int counter= 0;
        while(n>0){
            n= n>>1;
            counter++;
        }
        return counter;
    }

    // Finding the number of digits in in a particular base using direct formula.. 
    public static int digitsInBaseFormula(int n, int b){
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        return ans;
    } 

    // Pascal's triangle:
    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    // 1 5 10 10 5 1

    // find the sum of n'th row in pascal's triangle..
    // sum of each row in a pascal's traingle is nC0+ nC1+ nC2+..nCn= 2^n
    // sum of n'th row, sum= 2^(n-1)
    public static int pascal(int n){
        int ans= 1<<(n-1);
        return ans;
    }

    // Given a number find out if it's power of 2 or not..
    public static boolean power(int n){
        int a= n & (n-1);
        if( a == 0){
            return true;
        }
        return false;
    }

    // calculate a^b
    // 3^6 can be written as 3^(110) in binary and in explanation it can be 3^(2+4).. when computed it will be: 3^(110)= 3^4 * 3^2 * 3^0..
    public static int aToB(int base, int power){
        int ans= 1;
        while(power> 0){ 
            if((power & 1)==1){ // if our unit digit comes out to be 1 then it means we have to multiply our ans value in base 
                ans = ans* base;
            }
            base = base * base; // if our unit digit is zero which means we just have to square our base value
            power = power>>1; // doing right shift to get the unit digit binary value
        }
        return ans;
    }

    // given a number n find the number of set bits in it
    

}
