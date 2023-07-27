package com.dsa.Queue.implementation;

class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
    }
}
public class LinkedListImplementation {
    static class Queue{
        Node head;
        Node tail;
        int size = 0;
        void add(int data){
            Node newnode = new Node(data);
            if(size == 0){
                head = newnode;
                tail = newnode;
                size++;
            }else{
                tail.next = newnode;
                tail = newnode;
                size++;
            }
        }

        int remove(){
            if(size == 0){
                System.out.println("QUEUE is Empty");
                return -1;
            }

            if(size == 1){
                int d = head.data;
                head = null;
                size--;
                return d;
            }

            int d = head.data;
            head = head.next;
            size--;
            return d;
        }

        void display(){
            Node temp = head;

            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int peek(){
            if(size ==0){
                System.out.println("QUEUE is Empty");
                return -1;
            }
            return head.data;
        }
        // temp push added 

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5); // 5
        q.add(4); // 5 4
        q.add(3); // 5 4 3
        q.add(2); // 5 4 3 2
        q.add(1); // 5 4 3 2 1
        q.display(); // 5 4 3 2 1
        q.remove(); // 4 3 2 1
        q.display(); // 4 3 2 1
        System.out.println(q.peek()); // 4
        q.remove();
        System.out.println(q.peek()); // 3
        System.out.println(q.size); // 3

    }
}
