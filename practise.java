import java.util.*;

class Practise{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= "AbhayIsBitch..";
        String sub= "IsBi";
        boolean flag= false;

        for(int i= 0; i< s.length(); i++){
            if(s.charAt(i)== sub.charAt(0)){
                int c= i;
                flag= true;
                for(int j=0; j< sub.length(); j++){
                    if(s.charAt(c)!= sub.charAt(j)){
                        flag = false;
                        break;
                    }
                    c++;
                }
                if(flag) {System.out.println("exists");
                break;}
            }
        }

        if(!flag){
            System.out.println("ille");
        }
    }
}