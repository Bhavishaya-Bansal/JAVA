import java.util.*;

public class Practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);
        System.out.println(ch);
        // int a= (int)ch;

        if(ch >= 'a' && ch<= 'z' ){
            System.out.println("Lower");
        }
        else if(ch >= 'A' && ch<= 'Z'){
            System.out.println("Upper");
        }
        else{
            System.out.println("Not a char");
        }
        // System.out.println(a);
    }
}