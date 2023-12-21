package com.bhav.Oops5;

public class Main {
    public static void main(String[] args) {
        Son ram= new Son(18);
        ram.career();
        Daughter her= new Daughter(15);
        her.career();

        // Parent mom = new Parent(); // we cannot just create an object of an abstract class, we have to overrride it 

        Parent maa= new Parent(55){
            @Override
            void career(){
            }
            @Override
            void partner(){
            }
        };

        Parent.hello(); 

        
        // *** Interfaces ***

        MainCar car = new MainCar();
        // car.acc();
        // car.stop();
        // car.start();

        // if we make something like:
        // Engine car2= new MainCar();
        // car.a; // ***error***

        // here if we had any different variable in 'MainCar' we will not be able to access it here as..
        // what things we can access depends on this 'Engine car2' and which one of those versions to access depends on 'new MainCar()'

        NiceCar carr= new NiceCar();
        carr.start();
        // carr.startMusic();
        carr.upgradeEngine();
        carr.start();

    }
}