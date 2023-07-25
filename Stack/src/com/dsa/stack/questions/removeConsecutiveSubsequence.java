package com.dsa.stack.questions;

import java.util.Stack;
public class removeConsecutiveSubsequence {
    public static int[] remove(int arr[]){

        Stack<Integer> st = new Stack<>();

        for(int i =0;i<arr.length;i++){
            if(st.size() == 0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(st.peek() == arr[i]){
                if(i == arr.length-1 || st.peek() != arr[i+1]){
                    st.pop();
                }
            }
        }

        int[] ar = new int[st.size()];
        int y = 0;
        while(st.size()!=0){
            ar[y] = st.pop();
            y++;
        }
        return ar;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};

        int[] res = remove(arr);

        for(int i = res.length-1 ;i>=0;i--){
            System.out.print(res[i]+ " ");
        }
    }
}
