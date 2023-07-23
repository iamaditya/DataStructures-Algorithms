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

        while(tail!=null){
            System.out.print(tail.data+" ");
            tail = tail.prev;
        }
        System.out.println();
    }

    static void printRandom(Node ran){
        Node temp = ran;

        while(temp.prev!=null){
            temp = temp.prev;
        }

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }        System.out.println();
    }

    static Node insertHead(int data, Node head){
        Node temp = new Node(data);

        head.prev = temp;
        temp.next = head;

        return temp;
    }

    static Node insertTail(int data, Node tail){
        Node temp = new Node(data);

        tail.next = temp;
        temp.prev = tail;



        return temp;
    }

    static void insertAT(int ind, int data, Node head){
        Node cur = head;
        Node temp = new Node(data);

        for(int i=1;i<ind-1;i++){
            cur = cur.next;
        }

        temp.prev = cur.next.prev;
        temp.next = cur.next;

        cur.next.prev = temp;
        cur.next = temp;
    }

    static void deleteAt(int ind, Node head){
        Node temp = head;

        for (int i=1;i<ind-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
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
        printRandom(c);
        a = insertHead(9,a);
        a = insertHead(68,a);
        printList(a);
        printRev(f);
        System.out.println();
        System.out.println();

        Node t  = insertTail(70,f);
        printList(a);
//        printRev(t);

        System.out.println();
        insertAT(3,6,a);
        printList(a);
        printRev(t);
        System.out.println();
        System.out.println();


        deleteAt(5,a);
        printRev(t);
        printList(a);
    }
}
