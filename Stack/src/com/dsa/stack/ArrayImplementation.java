package com.dsa.stack;
class Stack{

    int arr[] = new int[5];
    int idx = 0;

     void push(int data){
        if(idx == 5){
            System.out.println("Stack OVERFLOW");
            return;
        }
        arr[idx] = data;
        idx++;
    }

    int pop(){

         if(idx == 0){
             System.out.println("Stack UnderFlow");
             return -1;
         }
         arr[idx-1] = 0;
         idx--;
        return arr[idx];
    }

    void display(){
         for(int i =0;i<idx;i++){
             System.out.print(arr[i]+" ");
         }
        System.out.println();
    }

    int size(){
         return idx;
    }
}
public class ArrayImplementation{


    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(5);

        st.display(); // 5
        st.push(4);
        st.display(); // 5 4
        st.push(1);
        st.display(); // 5 4 1
        System.out.println(st.size()); // 3
        st.display();// 5 4
        st.push(3);
        st.push(2);
        st.display();
        System.out.println(st.size()); // 2
        st.pop();
        st.pop();
        st.display();
    }
}
