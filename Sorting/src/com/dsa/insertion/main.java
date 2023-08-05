package com.dsa.insertion;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {

    public static void sortme(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            while(j>=0){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    j--;
                }else{
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,9,2,8,3,7,4,6,5};
        System.out.println(arr.length);


        sortme(arr);
        for(var x : arr){
            System.out.print(x+" ");
        }
    }
}
