package com.dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueCollection {

    public static void display(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        while(q.size()!=0){
            temp.add(q.remove());
        }
        System.out.print("[ ");
        while(temp.size()!=0){
            System.out.print(temp.peek()+" ");
            q.add(temp.remove());
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);// 5
        q.add(4);// 5 4
        q.add(3);// 5 4 3
        q.add(2);// 5 4 3 2
        q.add(1);// 5 4 3 2 1

        display(q);
        System.out.println(q);
    }
}
