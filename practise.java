import java.util.*;

class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int f= 0;
        int s= 1;
        int count= 2;
        while(count<= n){
            int temp =s;
            s = s+f;
            f= temp;
            count++;
        }
        System.out.println(s);

    }
}