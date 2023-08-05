package com.dsa.selection;
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {

    public static void sortme(int arr[]){
        //selection sort

        for(int i=0;i<arr.length;i++){

            int minIdx = i;

            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
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
