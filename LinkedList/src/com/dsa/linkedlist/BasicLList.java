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

    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);

        n1.next = n2;
        n2.next = n3;

        while(n1!=null){
            System.out.print(n1.data+" ");
            n1 = n1.next;
        }
    }
}
