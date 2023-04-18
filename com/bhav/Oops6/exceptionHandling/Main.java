package com.bhav.Oops6.exceptionHandling;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b=0;
        // int c = a/b; // Exception of type Arithmatic Exception (Run time exception)

        // to print c in a pretty way we can use try catch method
        // try{ // try specifies to try all the things and if any exception occurs use catch
        //     int d = a/b;
        // } catch(Exception e){
        //     System.out.println(e.getMessage());
        // } finally{ // even if an exception is thrown or not it will definately run
        //     System.out.println("this will always execute.");
        // }

        try{ 
            // divide(a, b);
            // throw new Exception("just for fun"); // this is just like mimicking an exception 
            String name= "bhav";
            if(name.equals("bhav")){
                throw new MyException("name is bhav");
            }
        } 
        catch(MyException e){
            System.out.println(e.getMessage());
        } 
        catch(ArithmeticException e){ // this will work but if we keep Exception on top of Arithmetic one then the Arithmetic one will show show error as if superior is already working then there is no need cross check it again fromt the one below it 
            System.out.println(e.getMessage());
        } 
        catch(Exception e){
            System.out.println("normal exception");
        } 
        finally{ // even if an exception is thrown or not it will definately run
            System.out.println("this will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{ // 'throws' says that it may throw an exception if we use 'divide'
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero"); 
        }

        return a/b;
    }
    
}
