package com.bhav.TreesKK;

// Every node in segment trees includes an interval and the value for the query applied on that interval..
// Ex: arr= [2, 3, 4, 5, 6] and query is 'addtion'.. root node will have the interval 0 to 4 and the query value will be 2+3+4+5+6 i.e. 20..

public class SegmentTrees {
    private static class Node{
        int data; // node data
        int startInterval; // interval starting 
        int endInterval; // interval ending
        Node left; 
        Node right; 

        public Node(int startInterval, int endInterval){
            this.startInterval= startInterval;
            this.endInterval= endInterval;
        }
    }

    Node root; // root node

    public SegmentTrees(int arr[]){
        //create tree using our array
        this.root= constructTree(arr, 0, arr.length- 1);
    }

    // we will return our node here
    private Node constructTree(int arr[], int start, int end){
        // Base Case
        if(start== end){ // means we are at the leaf node.. 
            Node leaf= new Node(start, end);
            // our leaf node's data would be the value at that index
            leaf.data= arr[start];
            return leaf;
        }

        // Recursion flow:
        // We will create a new node with the index at which we are at..
        Node node= new Node(start, end);
        int mid= (start+ end)/2;

        // constructing our left and right nodes..
        node.left= this.constructTree(arr, start, mid);
        node.right= this.constructTree(arr, mid+1, end);

        // We will get our every node's data with the help of it's left node data and it's right node data..
        node.data= node.left.data+ node.right.data;
        return node;
    }
    
    // Display function..
    public void display(){
        displaySegment(this.root);
    }

    /*The display the our function gives is in such manner:
                       LEFT NODE    =>   ROOT NODE/ CURRENT NODE   <=    RIGHT NODE
        Interval= [ , ] and data: x => Interval= [ , ] and data: x <= Interval= [ , ] and data: x
     */

    private void displaySegment(Node node) {
        String str= "";
        
        if(node.left != null){
            str= str+ "Interval= ["+ node.left.startInterval+ ", "+ node.left.endInterval+ "] and data: "+ node.left.data + " => ";
        }

        else{
            str= str+ "No left child.";
        }

        // for current node..
        str= str+ "Interval= ["+ node.startInterval+ ", "+ node.endInterval+ "] and data: "+ node.data + " <= ";

        if(node.right != null){
            str= str+ "Interval= ["+ node.right.startInterval+ ", "+ node.right.endInterval+ "] and data: "+ node.right.data;
        }

        else{
            str= str+ "No right child.";
        }

        System.out.println(str);
        System.out.println();

        // Calling recursion..
        if(node.left!= null){
            displaySegment(node.left);
        }

        if(node.right!=null){
            displaySegment(node.right);
        }

    }

    // How to find query..  
    public int query(int queryStartIndex, int queryEndIndex){
        return this.getQuery(this.root, queryStartIndex, queryEndIndex);
    }

    private int getQuery(Node node, int queryStartIndex, int queryEndIndex) {

        // Case 1- Node is completely present in the query, in this case we will take all of the value present inside this node
        if(node.startInterval>= queryStartIndex && node.endInterval<= queryEndIndex){ // In this case our node would be completely present in the query.. 
            return node.data;
        }

        // Case 2- Our node is completely outside the query, therefore we cannnot take any data from this node so we will return 0..
        else if(node.startInterval> queryEndIndex || node.endInterval< queryStartIndex){
            return 0;
        }

        // Case 3- The node is overlapping.. which means some interval of node is present outside and inside and the query.. so we will call the recursion for left and right node of that node..
        else{
            return this.getQuery(node.left, queryStartIndex, queryEndIndex)+ this.getQuery(node.right, queryStartIndex, queryEndIndex);
        }
    }

    // How updation is done.. when we change value of any index..
    public void update(int index, int value){
        this.root.data= updation(this.root, index, value);
    }

    private int updation(Node node, int index, int value) {
        // If index lies in the interval..
        if(index>= node.startInterval && index<= node.endInterval){
            // Base case.. just update the value
            if(index== node.startInterval && index== node.endInterval){
                node.data= value;
                return node.data;
            }
            // otherwise we will call recursion for the left and right and return the sum of the answers
            else{
                int leftAns= updation(node.left, index, value);
                int rightAns= updation(node.right, index, value);

                node.data= leftAns+ rightAns;
                return node.data;
            }
        }

        // If our node is completely outside.. we will just return the value..
        return node.data;
    }

}
