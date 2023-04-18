package com.bhav.Oops5;

public class Daughter extends Parent{

    public Daughter(int age){
        super(33);
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor.");
               
    }

    @Override
    void partner() {
        System.out.println("I will be with him.");
    }
    
}
