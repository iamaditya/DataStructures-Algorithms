package com.dsa.stack;

import java.util.Stack;

public class UnderFlowCondition {

    public static void main(String[] args) {
        Stack<Integer> newstack = new Stack<>();

        newstack.push(5);
        newstack.push(4);
        System.out.println(newstack);
        newstack.pop();
        System.out.println(newstack);
        newstack.pop();
        System.out.println(newstack);
        // now stack is empty

//        System.out.println(newstack.peek()); // condition is underflow
//        newstack.pop(); // same error
    }
}
