package com.dsa.linkedlist;

public class linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
        Node head ;
        Node tail ;
        void addLast(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;

            }else{
                tail.next = temp; // earlier tail was pointing to 5 so then 5's next pointing to 4
//                that means (5) node.next = temp
            }
            tail = temp; // then move tail

        }
        void addFirst(int data){
            if(head == null){
                addLast(data);
                return;
            }else{
                Node temp = new Node(data);

                temp.next = head;
                head = temp;
            }
        }
        void printList(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();

        l1.addFirst(6);
        l1.addLast(5);
        l1.addLast(4);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);
        l1.addLast(0);

        l1.printList();
        System.out.println();
        l1.addFirst(7);
        l1.printList();
    }


}
