package com.bhav.Basics;

import java.util.*;

public class Oops3_Inheritance {
    public static void main(String[] args){
        Box box1= new Box(4.5, 6.7, 5.3);
        Box box2= new Box(box1);
        System.out.println(box1.w + " "+ box2.h);

        BoxWeight box3= new BoxWeight();
        BoxWeight box4= new BoxWeight(2,3,4,8);
        System.out.println(box3.h+ " " +box3.weight);

        Box box5= new BoxWeight(2, 3, 4, 8); // here the parent is being refrenced thru child 
        // System.out.println(box5.weight); // ***error*** 
        System.out.println(box5.w); 

        // BoxWeight box6= new Box(2,3,4); // ***error*** this will give us an error as child is being refrenced to a parent... here we are given access to variables that are in refrence type i.e. BoxWeight.. hence we will have access to weight variable.. but here as the object is created from parent class therefore we cannot initialize the weight value here
        // System.out.println(box6.h);


    }   
}

// child class can access the extra variable of parent class, but if the object is directly created from the parent class then child class cannot access it OR if an object is created from an upper child class then also the child class below it cannot access the object
class Box{
    private double l; // privates can be accessed only in the single file not in any other file, even of same package
    double h;
    double w;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    Box(double side){
        super(); // here Box is not derived from anything yet we can use the super keyword here.. bcs here we are calling it object.. every class we create has Object as it superclass(Every single class inherits the object class)

        this.l= side;
        this.w= side;
        this.h= side;
    }

    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    // super keyword is used to refer the child class to super class from which it is defined/ derived super keyword.. It is also used in multi level inheritance 
    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // this will call the parent class constructor, It is used to initiaize values present in the parent class.. Super basically means class directly above it 

        System.out.println(super.h); // here we used 'super' keyword bcs if this class also have some variable with same name then 'this' keyword will refer this class's variable.. But if we want to use the keyword present in above class then we use 'super' keyword
        this.weight= weight;
    }
}