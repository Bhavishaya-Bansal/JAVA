import java.util.*;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fruit= sc.next();

        switch(fruit){ // here comes the expression for which we have to select looks for and run different cases
            case "Mango":
                System.out.println("The king of fruits");
                break; // to exit the switch cases.. if mango runs
            
            case "Apple":
                System.out.println("A juciy red fruit");
                break;

            case "Orange":
                System.out.println("Round fruit");
                break;
            
            case "Grapes":
                System.out.println("Small fruits");
                break;

            default:
                System.out.println("Please choose another fruit.");

        }

        
        switch(fruit){ // Enhanced switch function
            case "Mango" -> System.out.println("The king of fruits");
            case "Apple" -> System.out.println("Juicy red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruits");
        } 
        // this is the code for enhanced switch cases
    }
}