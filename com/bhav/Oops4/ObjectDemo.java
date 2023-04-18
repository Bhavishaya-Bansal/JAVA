package com.bhav.Oops4;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num= num;
        this.gpa= gpa;
    }

    public int hashCode(){
        return super.hashCode(); //It gies us a number representation of the object via a number
    }
    
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(34, 76.5f);
        ObjectDemo obj3 = new ObjectDemo(45, 78.9f);

        // if(obj < obj3){ // ***error*** as there is nothing specific, either to compare num or the gpa. Hence error
        //     System.out.println("obj is less than obj 3");
        // }

        if(obj == obj3){ 
            System.out.println("obj is equal to obj 3");
        } // here we will have no error but there wont be any output either ( '==' is a comparitive and checks whether these two variables are pointing to the same object or not (address check))

        if(obj.equals(obj3)){ 
            System.out.println("obj is equal to obj 3");
        } // here we will have no error but there wont be any output either ( 'equals' is kind of like a method and checks the content of it (value check))

        System.out.println(obj.hashCode()); // Gives some random value
        System.out.println(obj2.hashCode()); // Gives different value
        // Hashcode is a random integer value formed by an algorithm to identify if an object is the same object or some different object
    }
}
