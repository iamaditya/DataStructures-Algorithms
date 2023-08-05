package com.dsa.bubble;

public class ques {

    public static void zerosortme(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] == 0 ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,42};
        System.out.println(arr.length);
        zerosortme(arr);

        for(var a : arr){
            System.out.print(a + " ");
        }
    }

}
