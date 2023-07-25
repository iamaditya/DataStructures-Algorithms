package com.dsa.stack.LLImplementation;

class Node{ // User Defined Data Type
    int data;

    Node next;
    Node(int data){
        this.data = data;
    }
}


class Stack{ // User Defined Data Structure
    private int size = 0;
    private Node head;

    void push(int data){
        Node temp = new Node(data);
            if(head == null){
                head = temp;
                size++;
                return;
            }

            temp.next = head;
            head = temp;
            size++;
    }

    int pop(){
        if(head == null){
            System.out.println("STACK UNDERFLOW");return -1;}
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void displayRec(Node temp){
        if(temp==null) return;
        displayRec(temp.next);
        System.out.print(temp.data+" ");
    }
     void displayC(){
        displayRec(head);
    }

    int peek(){
        if(head == null){
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        return head.data;
    }
    int getSize(){
        return size;
    }

}
public class ListImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.getSize());
        st.push(5);
        st.display();  // 5
        st.push(4);
        st.display();  // 4 5
        st.push(3);
        st.display(); // 3 4 5
        st.push(2);
        st.display(); // 2 3 4 5
        st.push(1);
        st.display(); // 1 2 3 4 5
        st.pop();
        st.display(); // 2 3 4 5
        System.out.println(st.peek());
        st.push(1);
        System.out.println(st.getSize());

        st.displayC();
    }
}
