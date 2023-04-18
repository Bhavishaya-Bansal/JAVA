package com.bhav.Oops4;

public class AccessModifiers {
    private int num;
    String name;
    int[] arr;

    // Getter: Gets the value
    public int getNum(){
        return num;
    }

    // Setter: Sets the value
    public void setNum(int num){
        this.num= num;
    }

    public AccessModifiers(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    
}
