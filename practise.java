import java.util.*;

class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int ans= 0;

        
        while(true){
            
            System.out.print("enter the operator: ");
            char op= sc.next().trim().charAt(0);

            if(op== '-' || op=='+' || op== '*' || op== '/' || op == '%'){
                System.out.println("Enter the 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op== '+'){
                    ans = num1+ num2;            
                }
                if(op== '-'){
                    ans = num1- num2;            
                }
                if(op== '*'){
                    ans = num1* num2;            
                }
                if(op== '/'){
                    if(num2!=0){
                        ans= num1 / num2;
                    }
                    else{
                        break;
                    }
                }
                if(op== '%'){
                    if(num2!=0){
                        ans= num1 % num2;
                    }
                    else{
                        break;
                    }
                }
            }
            else if(op == 'x'|| op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator");
                break;
            }
            System.out.println(ans);
        }


    }
}