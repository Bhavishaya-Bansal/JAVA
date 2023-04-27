import java.util.*;

public class Oops2 {
    // In here class 'Oops2' cannot be static(because it is not itself dependent on any other class) but the classes inside a class can be static(as we can see here class 'main' is static) 
    public static void main(String[] args){

        A obj= new A("bhav");
        System.out.println(obj); // when we print just the object it gives us some random hash value

        Human bhav= new Human(20, "bhav", 5000000);
        Human ram= new Human(45, "ram", 67000);

        System.out.println(bhav.population); // here the output will be one bcs every time the 'population' will be based on the object but not on the collective class but the population should be same for everyone therefore we use the static keyword.. To use the population of whole
        System.out.println(ram.population); // here the output will be one bcs every time the 'population' will be based on the object but not on the collective class but the population should be same for everyone therefore we use the static keyword.. To use the population of whole

        System.out.println(bhav.populationCount); // we should not use the static field like this.. which means by not using the object name either but using the class name i.e. Human
        System.out.println(ram.populationCount); // we should not use the static field like this.. which means by not using the object name either but using the class name i.e. Human
        // the above method of using the static keyword by object name will give us the correct output but the convention of using static keyword is wrong

        System.out.println(Human.populationCount); // this is the correct convention to execute the static keyword


        // seeing(); // *** error *** bcs inside a static method we cannot use anything that is non static method as something that it non static belongs to an object
        
        greeting(); // now as the method is static we can now access it
        
        Oops2 objName = new Oops2();
        objName.seeing2(); // to execute 'seeing2' here we have to make an object for it but....
    }


    void seeing(){
        // greeting(); // static inside a non static.. this can work 
        System.out.println("Hi, nice meeting you");
    }


    void seeing2(){
        seeing(); // ... But two non static all call each other as they are eventually being called by a static fnc the 'main' fnc of the program(here our main program is oops2)
    }

    
    static void greeting(){
        // seeing(); // ***error*** non static inside a static therefore error.. so to resolve this error we have to make an object for the 'seeing'..

        // we cannot access non static stuff without refrencing their instances(objects) in a static context
        // hence, we are refrencing it here
        Oops2 obj = new Oops2(); 
        obj.seeing();

        System.out.println("Hi, nice meeting you");
    }
}

class Human{
    int age;
    String name;
    int salary;
    long population;
    static long populationCount;

    static void message(){
        // System.out.println(this.age); // ***error*** we cannot use keyword inside static bcs static is not dependent on any object so how can it allow something that is dependent on an object (static does not allow anything non static)
    }

    Human(int age, String name, int salary){
        this.age= age;
        this.name= name;
        this.salary= salary;
        this.population+=1; 
        this.populationCount +=1; // we should not use the static field like this.. which means by not using the 'this' keyword but by using the name of the class i.e. Human
        Human.populationCount +=1; // static keywords according to correct convention are meant to be used by class name
    }
}

class A{
    final int num=99;
    String name;

    public A(String name){ // --> constructor
        // System.out.println();
        this.name = name;
    }

}
