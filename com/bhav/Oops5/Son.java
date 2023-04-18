package com.bhav.Oops5;

public class Son extends Parent{

    public Son(int age){
        super(35);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder.");
               
    }

    @Override
    void partner() {
        System.out.println("I will be with her." );
    }
    
}
