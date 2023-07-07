import java.util.*;
class Practise {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        func(num);        
    }

    public static void func(int num){
        if(num == 0){
            System.out.println("Num is zero");
            return;
        }
        else if(num< 0){
            if(num % 2== 0){
                System.out.println("it is negative even");
                return;
            }
            else{
                System.out.println("num is negative odd");
                return;
            }
        }
        else{
            if(num % 2== 0){
                System.out.println("it is positive even");
                return;
            }
            else{
                System.out.println("num is positive odd");
                return;
            }
        }
    }
}