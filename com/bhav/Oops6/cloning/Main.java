package com.bhav.Oops6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Humans bhav= new Humans(20, "bhav");
        // Humans twin= new Humans(bhav); // the problem arises is that we are taking a lot to time as we are creating a new object everytime.. to resolve this problem we can use the clone method 
        // to make a clone instead of using above way, we can use:

        Humans twin = (Humans)bhav.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=188;
        System.out.println(Arrays.toString(twin.arr)); // here the value for twin array changes as commanded
        System.out.println(Arrays.toString(bhav.arr)); // in case of shallow copying: values changes here too.. in case deep copying: values does not changes here 

    }
}
