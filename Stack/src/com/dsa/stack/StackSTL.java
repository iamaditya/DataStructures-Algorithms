package com.dsa.stack;

import java.util.Stack;
public class StackSTL {

    static Stack<Integer> insertAt(int ind, int val, Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>ind-1){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;
    }

    static void printStack(Stack<Integer> st ){
        int size = st.size();

        int arr[] = new int[size];
        int i = size-1;
        while(st.size()!=0){
            arr[i] = st.pop();
            i--;
        }
        System.out.print("[ ");
        for(int y=0;y<size;y++){
            System.out.print(arr[y]+" ");
            st.push(arr[y]);
        }
        System.out.println("]");

    }

    static void stackRevRec(Stack<Integer> st){

        if(st.size()==0) return;
        int top = st.pop();

        System.out.print(top+" ");
        stackRevRec(st);
        st.push(top);
    }
    static void stackRec(Stack<Integer> st){

        if(st.size()==0) return;
        int top = st.pop();
//
        stackRec(st);
        st.push(top);
        System.out.print(top+" ");
    }
    static void addbottom(Stack<Integer> st , int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }

        int top = st.pop();
        addbottom(st,x);
        st.push(top);

    }
    static void reverseme(Stack<Integer> st){
            if(st.size() == 0) return;
            int top = st.pop();
            reverseme(st);
            addbottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack : "+st+ " Size : "+st.size());
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();

        System.out.println(st2);

        while(st.size()>0){
            st2.push(st.pop());
        }

        System.out.println(st2);
        Stack<Integer> finalStack = new Stack<>();

        while(st2.size()>0){
            finalStack.push(st2.pop());
        }

        System.out.println("FINAL STACK : "+finalStack);

        st = insertAt(2,6,finalStack);
        System.out.println("INSERT AT : : ");
        System.out.println(st);

        System.out.println("MANUAL PRINTING : :");
        printStack(st);
        System.out.println("Stack Reverse using Recursion");
        stackRevRec(st);
        System.out.println("\nStack using Recursion");
        stackRec(st);
        System.out.println();
        reverseme(st);
        System.out.println("\nREVERSE STACK USING RECURSION");
        System.out.println(st);
    }
}
