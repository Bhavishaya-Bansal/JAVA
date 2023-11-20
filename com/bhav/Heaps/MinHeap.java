package com.bhav.Heaps;

import java.util.*;

// This is a building of MIN HEAP data structure..
// Here we have made our Heap class generic and are using 'Comparable<T>' from 'Comparable' class.. It is used to compare two objects..
public class MinHeap<T extends Comparable<T>> {

    private ArrayList<T> list;

    // Constructor
    public MinHeap(){
        list= new ArrayList<>();
    }

    // In the working of Heap we have to do multiple swapping at multiple steps so just to make the work easy I have made 'swap' function..
    private void swap(int first, int second){
        // Stored value of first index in temp
        T temp = list.get(first); // get first index that we have to swap..
        // setting first with value of second index..
        list.set(first, list.get(second));
        // setting value of second index equal to value of temp i.e. value of first index..
        list.set(second, temp);
    }

    // as ArrayLists are zero indexed so we are writing the code as for zero indexed values

    // Our parent's index for any 'index' would be:
    private int parent(int index){
        return (index- 1) / 2;
    }

    // Similarly left index of any 'index' would be:
    private int left(int index){
        return (2* index)+ 1;
    }

    // And the right index of any 'index' would be:
    private int right(int index){
        return (2* index)+ 2;
    }

    // insert a new value in the heap..
    public void insert(T value){
        // first we will put the element at the last index
        list.add(value);

        // Now we will perform UP HEAP method: Swap the values from bottom to the up..
        upHeap(list.size()- 1); // calling 'upHeap' from the last index..
    }

    private void upHeap(int index) {
        // Base condn
        if(index== 0){
            return;
        }

        // here we will first check for the parent..
        int p= parent(index);

        // we will check that is our parent greater than the current item(that we are inserting) or not.. If the current item is smaller than our parent then Swap.. (As we are forming a min heap here)
        // here we are comparing if the difference would be negative that means that value we are inserting now(our current item) is smaller than our parent..
        if(list.get(index).compareTo(list.get(p))< 0){
            swap(index, p);

            // Now as our values are swapped.. now our new element for which we would have to check is our parent element
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        // To remove the item at the zeroth index
        T temp= list.get(0);

        // after removing we know first we have to place our last index element at the very first index
        T last= list.remove(list.size()- 1);
        
        // For the case when we have only one item in our heap..
        if(!list.isEmpty()){
            // putting the last element at first index..
            list.set(0, last);
        }

        // Here we will perform DOWN HEAP method: move from top to the bottom of the heap..
        downHeap(0);

        return temp;
    }

    private void downHeap(int index) {
        // Take our current element that we are at(i.e. the top element of the heap) to be the minimum..
        int min= index;

        // And compare the 'min' with left and right child of that current index..
        int left= left(index);
        int right= right(index);

        // check if our left exists in our list our not
        if(left< list.size()){
            // then further check whether our current element has value smaller than the left child or not.. If not then SWAP them..
            if(list.get(min).compareTo(list.get(left))> 0){
                min= left;
            }
        }

        // Now we will do the same with our right child..
        if(right< list.size()){
            if(list.get(min).compareTo(list.get(right))> 0){
                min= right;
            }
        }

        // if our min is not same(it has been updated).. It means we have found lesser in either right side or left side.. Therefore we will SWAP our min and index and call the 'downHeap' fucntion for the our new current index(that will be 'min')
        if(min!= index){
            swap(min, index);
            downHeap(min);
        } 
    }
}
