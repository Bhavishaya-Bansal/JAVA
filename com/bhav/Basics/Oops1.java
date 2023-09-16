package com.bhav.Basics;

import java.util.*;
public class Oops1{
    public static void main(String[] args) {

        Student[] students = new Student[5]; // Creating a class also means like defining our new own data type, according to our need. Here we have created the data type and named it Student (and always classes are named with first capital letter) 
        System.out.println(Arrays.toString(students)); // output will be null as, until nothing is initialized in Student class by default it will be null


        // Student bhav; // this is just declaring 
        // bhav.salary; // this is gonna give us an error because 'salary' does not exist in the type of bhav, type of bhav is student (and java is a static type language) 
        

        Student bhav= new Student(); //this is proper making of an object 
        // bhav.name= "bhav"; 
        // bhav.rollNo= 9;
        // bhav.marks= 89.11f; // instead of everytime declaring students name by name and property by property we need to use a keyword which automatically declare the properties to them 

        System.out.println(bhav.name);
        System.out.println(bhav.rollNo);
        System.out.println(bhav.marks);


        Student bhavishaya = new Student("bhavishaya bansal", 05, 87.05f);
        System.out.println(bhavishaya.name);
        System.out.println(bhavishaya.rollNo);
        System.out.println(bhavishaya.marks);


        Student one = new Student();
        Student two = one;
        one.name= "harish pandey";
        System.out.println(two.name);// here I chanegd the name of 'one' but name of 'two' was also changed because they are both referring to the same object.. 

        // *** Wrapper class***
        // A wrapper class is a class which contains primitive data types. In other words wrapper class provides a way to use primitive data types as objects 
        int a =10;
        Integer num =20; // this is created as an object of type Integer hence it would have a lot more properties than integer 'a' would 

        final int number= 7015;
        // number = 7132; // ***error*** because the 'final' keyword integers cannot be modifed, therefore, we have to initialize them while declaring them 

        final Student prateek = new Student();
        prateek.name= "new name"; // here we can change the value of the final object(prateek) because 'final' keyword only stops us to change value of primitive data types.. We can change the value of non primitive data types even if they are final 

        // prateek= new Student("ram", 16, 87f); // But when a non primitive is final, we cannot reassign it 
    
    }
}
// Creating a class : class CLASSNAME{**content**}
class Student{     
    int rollNo;
    String name;
    float marks;

    // instead of everytime declaring objects property by property we need to use a keyword which automatically declare the properties to them... Here comes the use of "this" keyword
    Student(){
        this.name= "bhav";
        this.rollNo= 9;
        this.marks= 99.5f;
    }// when we use this keyword whatever the constructor is called it puts the properties of 'this' constructor's in the object created..(here our constructor is Student(one called here) and the object is 'bhav' which acquires the properties of 'this' present in the constructor)


    // An example for below constructor will be:
    // Student ram = new Student("ram", 17, 89.13f)
    Student(String name, int rno, float marks){ // to execute this we have to provide values while declaring the object.. 
        // name= name; // here this will provide the output as 'null' bcs java will not be able to understand what name are we inputing and which name are putting value of
        this.name= name;
        this.rollNo= rno;
        this.marks= marks;
        // in order to make things less messy we use 'this' keyword 
        // in order to avoid above problem we use 'this'
    }
    // the process of creating more than one consturctor of same name with different list of arguments for an object or variable is called constructor overloading


    // Calling a contructor from another constructor
    // Student(){
    //     this("amrish", 113, 67.66f);
    //     // here the 'this' would be calling the constructor with all the pre given values..
    //     // internally this would be something like: new Student("amrish", 113, 67.66f);
    // }

}
