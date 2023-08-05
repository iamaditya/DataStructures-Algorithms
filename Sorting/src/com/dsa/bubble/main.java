package com.dsa.bubble;

public class main {

    public static void sortme(int arr[]){
        for(int i=0;i<arr.length;i++){

             boolean flag = false;
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        sortme(arr);

        for(var x : arr){
            System.out.print(x+" ");
        }
    }
}
