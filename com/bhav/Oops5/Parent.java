package com.bhav.Oops5;

public abstract class Parent{
    
    int age;
    public Parent(int age){
        this.age= age;
    }

    static void hello(){
        System.out.println("hey");
    }

    // abstract Parent(); // ***error*** we cannot create abastract constructors

    abstract void career();
    abstract void partner();

}