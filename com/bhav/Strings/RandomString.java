package com.bhav.Strings;

import java.util.Random;
public class RandomString {
    static String generate(int size){
        StringBuffer sb= new StringBuffer();

        Random random= new Random();

        // everytime a new random string will be generated..
        for(int i=0; i< size; i++){
            int randomChar= 97+ (int)(random.nextFloat()* 26); // 97 is the ascii value of 'a'
            sb.append((char)randomChar);
        }

        return sb.toString();
    }
}
