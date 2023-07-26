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
    public void display(){

        if(size == 0){
            System.out.println("QUEUE is Empty");
            return;
        }
        for(int i = f;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        Queue q = new Queue();
        q.display();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
    }
}
