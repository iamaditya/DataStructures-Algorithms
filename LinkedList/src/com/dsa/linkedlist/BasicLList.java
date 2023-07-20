package com.dsa.linkedlist;

public class BasicLList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
public static void printList(Node head){
       if(head == null) return;

    System.out.print(head.data+" ");
    printList(head.next);
    }

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void printTest(Node head){ // Print in Reverse Order
        if(head == null) return;

        printTest(head.next);
        System.out.print(head.data+" ");

    }

    public static void main(String[] args) {
        Node head;
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        head = n1;
        System.out.println("Using Loop");
        print(head);
        System.out.println("\nUsing recursion");
        printList(head);
        System.out.println("\nUsing recursion TEST");
        printTest(head);
    }
}
