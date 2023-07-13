package com.bhav.Stacks;

public class CustomDynamicStack extends CustomStack{ // To create our Custom Stack which works as a real stack that is that it does not gets filled but creats new space of its own when items are insert beyond current limit( Just like ArrayLists)

    public CustomDynamicStack() {
        super(); // constructor in parent class that does not take any argument -> CustomStack()
    }

    public CustomDynamicStack(int size) {
        super(size); // constructor in parent class that takes int argument in input -> CustomStack(int size)
    }

    // All other fucntions peek, isEmpty, isFull, pop are same.. but we just need to modfiy our push opertaion..
    // Therefore to use the push function of this class than that of CustomStack we will @Override it..
    @Override 
    public boolean push(int item) {
        // this takes care of it being full by doubling the array size
        if(this.isFull()){
            // IF it is full -> Double the array size
            int[] temp = new int[data.length*2];

            //  Copy all previous items in new data
            for(int i =0; i<data.length; i++){
                temp[i]= data[i];
            }

            data= temp;

        }
        //  here at this point we know that array is not full bcs it did not went in IF(isFull)
        // insert items
        return super.push(item); // this will call the push method of CustomStack
    }     

}