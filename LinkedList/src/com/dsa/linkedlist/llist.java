package com.dsa.linkedlist;

public class llist {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void addLast(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void printList(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
    linkedlist l1 = new linkedlist();
    l1.addLast(5);
    l1.addLast(4);
    l1.addLast(3);
    l1.addLast(2);
    l1.addLast(1);
    l1.addLast(0);

    l1.printList();
    }
}
