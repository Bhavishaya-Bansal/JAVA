package com.bhav.Oops5;

public class MainCar implements Brake, Engine {

    int a=99;

    @Override
    public void start() {
        System.out.println("I start normally");
    }

    @Override
    public void stop() {
        System.out.println("I stop normally");
    }

    @Override
    public void acc() {
        System.out.println("I acc normally");
    }

    @Override
    public void brake() {
        System.out.println("I brake normally");
    }

    // here we can see that we are inheriting the properties of more than one classes(multiple inheritance) with the help of interfaces
    
}
