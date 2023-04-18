package com.bhav.Oops6.cloning;

public class Humans implements Cloneable{ // if we want to clone an object for that class then we have to implement Cloneable
    int age;
    String name;
    int arr[];

    public Humans(int age, String name) {
        this.age= age;
        this.name= name;
        this.arr=new int[]{3,4,5,6,9,2};
    }

    // public Humans(Humans other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // } // after cloning we dont this in use as cloning does the same thing but faster 
    
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone(); // this is shallow copying 
    // }

    public Object clone() throws CloneNotSupportedException{
        Humans twin = (Humans)super.clone(); // this is shallow copying 

        // deep copying
        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i]= this.arr[i];
        }
        return twin;
        
    }

}
