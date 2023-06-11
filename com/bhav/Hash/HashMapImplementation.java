package com.bhav.Hash;

import java.util.*;
// This code is the how a hashMap is implemented
public class HashMapImplementation {
    static class HashMap<K, V> { // this is our hashMap data structure.. K and V are the generics here as we do not know exactly which data type will be used here
        private class Node{ // defines node of linked list
            K key;
            V value;

            public Node(K key, V value){ // constructor
                this.key= key;
                this.value= value;
            }
        }

        private int n; // n- total number of nodes
        private int N; // n- total number of buckets 
        private LinkedList<Node> buckets[]; // array of name 'buckets' whose type is of linkedList of node 

        @SuppressWarnings("Unchecked") // To remove unwanted java warnings
        public HashMap(){ // constructor of HashMap class
            this.N= 4; 
            this.buckets= new LinkedList[4]; // initialization of array
            for(int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>(); // creating empty linkedList on every index of our array--> to store data
            }
        }

        private int hashFunction(K key){ // ouor bucketIndex can only be in range 0 to N-1
            int bucketIndex= key.hashCode(); // key.hashCode will convert the key value in integer 
            return Math.abs(bucketIndex) % N; // if our hashCode gives us a negative value for hashCode then we will make it positive by using 'absolute' func.. as for range of bucketIndex we have returned the remainder
        }

        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> LL= buckets[bucketIndex];
            for(int i=0; i<LL.size(); i++){
                if(LL.get(i).key== key){ // if our nodes's key matches the key then.. return the i
                    return i; // our this i is dataIndex 
                }
            }
            return -1; // our key deos not exist
        }

        private void rehash(){
            // we need to first store our current array that is buckets here and then we will create a new bigger array(new bigger bucket)
            LinkedList<Node> oldBucket[]= buckets;
            buckets = new LinkedList[N*2]; // increased size of our array

            for(int i=0; i<N*2; i++){ // created an empty LinkedList in our bucket to store new data
                buckets[i]= new LinkedList<>();
            }

            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> LL = oldBucket[i]; // getting each node from our oldBucket
                for(int j=0; i<LL.size(); j++){
                    Node node = LL.get(j);
                    put(node.key, node.value); // putting nodes from oldBucket in new bucket
                }
            }
        }

        public void put(K key, V value){ // put function
            // first we need to find bucket index to check whether our key exists or not
            int bucketIndex= hashFunction(key); // let's say there already exists a func that takes input our key and gives us bucketIndex
            int dataIndex= searchInLL(key, bucketIndex); // this func will tell whether our key exists on our bucketIndex or not--> will give some data index

            // if our dataIndex if zero or positive this means that or key does exists but if it becomes -1 it means that our key does not exists already
            if(dataIndex== -1){ // key doesnot exist
                // if our dataIndex does not exists then we will have to make a new node
                buckets[bucketIndex].add(new Node(key, value)); // new node added to pur LinkedList

                n++; // as our key already didnot existed here therefore the value of our 'n' would increase
            }
            else{ // key exists
                // if our key already exists 
                Node node= buckets[bucketIndex].get(dataIndex); // we will get our dataIndex which means our key is stored at particular dataIndex and is stored in a Node
                node.value= value; // update the value of Node
            }

            double lambda = (double)n/N;
            // check the value of lambda for cases:
            if(lambda> 2.0){ // here 2.0 is just an example value taken by us which is our 'k'-> the threshold value
                // rehashing will occur here..
                rehash();
            }
        }

        public boolean containsKey(K key){ // containsKey func
            int bucketIndex= hashFunction(key); 
            int dataIndex= searchInLL(key, bucketIndex); 

            if(dataIndex== -1){ 
                return false; 
            }
            else{ 
                return true; 
            }
        }

        public V remove(K key){ // remove key func
            int bucketIndex= hashFunction(key); 
            int dataIndex= searchInLL(key, bucketIndex); 

            if(dataIndex== -1){ 
                return null; 
            }
            else{ 
                Node node= buckets[bucketIndex].remove(dataIndex); // removed our dataIndex
                n--; // decrease the size
                return node.value; 
            }
        }

        public V get(K key){ // get function
            int bucketIndex= hashFunction(key); 
            int dataIndex= searchInLL(key, bucketIndex); 

            if(dataIndex== -1){ 
                return null; 
            }
            else{ 
                Node node= buckets[bucketIndex].get(dataIndex); 
                return node.value; 
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>(); 
            for(int i=0; i< buckets.length; i++){
                LinkedList<Node> LL= buckets[i];
                for(int j=0; j<LL.size(); j++){
                    Node node= LL.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0; // if no node is there it means our hashmap is empty
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 122);
        map.put("us", 46354);
        map.put("china", 3423);

        ArrayList<String> keys= map.keySet();
        for(int i=0; i< keys.size(); i++){
            System.out.println(keys.get(i)+ " "+ map.get(keys.get(i))); // 'keys.get(i)' will give us the value of all of the keys and 'map.get(keys.get(i))' will give us the values respective to the keys
        }

        map.remove("India");
        System.out.println(map.get("India")); // after removing 'India' this would give us null as output
    }
    
}
