package com.dsa.stack;

import java.util.Stack;
public class StackSTL {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack : "+st+ " Size : "+st.size());
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st.peek());

        System.out.println(st);

        st.pop();

        System.out.println(st.peek());

        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        System.out.println();

        while(st.size()>0){
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println(st.isEmpty());
    }
}
