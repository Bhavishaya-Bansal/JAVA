import java.util.*;

class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int count= 0;
    
        int n= sc.nextInt();
        while(n>0){
            int rem= n% 10;
            if(rem == 7){
                count++;
            }
            n= n/10;
        }

        System.out.println(count);

    }
}