package com.bhav.Oops5;

public class NiceCar {
    private Engine engine; // car has internal engine of its own of Engine type
    private Media player;

    public NiceCar(){
        engine= new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine= engine;
    }
    
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine= new ElectricEngine();
    }
    
}
