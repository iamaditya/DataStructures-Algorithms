package com.dsa.linkedlist;

public class doublyLinkedList {
    public static class Node{
        int data;

        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    static void printList(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp  = temp.next;
        }
        System.out.println();
    }

    static void printRev(Node tail){
        Node temp = tail;

        while(tail!=null){
            System.out.print(tail.data+" ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//         5 - 4 - 8 - 2 - 1 - 3
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(1);
        Node f = new Node(3);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next =d;
        d.prev =c;
        d.next = e;
        e.prev = d;
        e.next= f;
        f.prev = e;
        printList(a);
        printRev(f);
    }
}
