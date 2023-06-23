public class BitManipulation {
    public static void main(String[] args) {
        int n= 6;
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

        int out= magic(n);
        System.out.println(out);
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
    // public static int magic(int n){
        
    // }

    public static int magic(int n){
        int ans=0;
        int base= 5; 
        while(n>0){
            int lastDigit= n & 1;
            n = n>>1; 
            ans= ans + (lastDigit * base);
            base = base* 5;
        }
        return ans;
    }


}
