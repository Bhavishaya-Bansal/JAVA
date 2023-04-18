package com.bhav.Oops7.collections.enumExamples;

public class Basic{
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday; // these are enum constants.. every single one present is public, static and final member.. nad as they are final we cannot create child enums
        // type of all above enums is week

        Week(){
            System.out.println("Constructor called for "+this);
        } // this is not public or protected.. only private or default bcs if its private or protected then it allow us intitalization of more than one objects and we dont want to create new objects(this is not the enums concept)
        
        // internally its like: 
        // public static final Week Monday = new Week();
        
    }


    public static void main(String[] args) {
        Week week;
        week= Week.Monday;
        System.out.println(Week.valueOf("Monday"));
        // for(Week day: Week.values()){
        //     System.out.println(day);
        // }

        // System.out.println(week);
        // System.out.println(week.ordinal()); // ordinal tells us the position of the enum declaration
    }
       
}

