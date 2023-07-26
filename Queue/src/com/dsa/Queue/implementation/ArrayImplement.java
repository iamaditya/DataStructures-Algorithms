package com.dsa.Queue.implementation;

 class Queue{
    int f = -1;
    int r = -1;
    int size = 0;
    int[] arr= new int[10];

    public void add(int val){
        if(r == arr.length-1){
            System.out.println("QUEUE IS FULL");
            return;
        }

        if(f==-1 && r ==-1){
            arr[++r] = val;
            f++;
        }else{
            arr[++r] = val;
        }

        size++;
    }
    public int remove(){
        if(f==-1){
            System.out.println("QUEUE is Empty");
            return -1;
        }
        int data = arr[f];
        f++;
        size--;
        return data;
    }

    public int peek(){
        if(f == -1){
            System.out.println("QUEUE is Empty");
            return -1;
        }
        return arr[f];
    }
}
public class ArrayImplement {
    public static void main(String[] args) {

    }
}
