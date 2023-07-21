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
            System.out.println();
        }

        void insertatpos(int pos, int data) {
            if(pos == 1){
                addFirst(data);
            }
            else{
                Node temp = head;
                Node newNode = new Node(data);

                for (int i = 1; i < pos -1; i++) {
                    temp = temp.next;
                }

                if(temp.next!=null){
                    newNode.next = temp.next;
                    temp.next = newNode;
                }else{
                    addLast(data);
                }
            }
        }

        int getAt(int pos){
            Node temp = head;

            for(int i=1;i<=pos-1;i++){
                temp =temp.next;
            }
            return temp.data; 
        }

        void addLastHead(int data){
            Node temp = head;
            Node newNode = new Node(data);
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newNode;
            tail = newNode;
        }

        void deleteatPos(int pos){
            Node    temp   =   head;

            if(pos == 1){
                head = head.next;
                return;
            }
            for(int i = 1;i<pos-1;i++){
                temp = temp.next;
            }

            if(temp.next.next == null){
                tail = temp;
            }

            temp.next = temp.next.next;

        }

        void pointer(int n){
            Node fast = head;
            Node slow = head;

            for(int i=1;i<=n;i++){
                fast = fast.next;
            }
            while(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println(slow.data+"< - slow ");
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

            l1.insertatpos(3,8);
            l1.insertatpos(1,10);
            l1.insertatpos(11,69);
            l1.printList();
            System.out.println("Data at pos 8 : "+l1.getAt(8));
            l1.addLastHead(12);
            l1.printList();
            System.out.println(l1.head.data+" "+l1.tail.data);
            l1.deleteatPos(3);
            l1.printList();
            l1.deleteatPos(1);
            l1.printList();
            System.out.println(l1.tail.data);
            System.out.println(l1.head.data);
            l1.pointer(2);
        }
}
