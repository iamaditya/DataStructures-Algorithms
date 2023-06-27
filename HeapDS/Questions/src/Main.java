import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
////        find kth largest element in array.
//        int arr[] = {1,7,2,8,3,6,4,5};
//        int k = 5;
//        Arrays.sort(arr);
////        System.out.println();
//        for (var e : arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        System.out.println(k+"th largest element : "+arr[arr.length-k]);

//
//        nlogn complexity


        int arr[] = {1,8,2,7,3,6,4,5};
        int k = 3;
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        System.out.print("ARRAY : ");
        for (var e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        for (var e : arr){
            heap.add(e);
        }
        System.out.println("HEAP : "+heap);
        for (int i=0;i<k-1;i++){
            heap.remove();
        }

        System.out.println(k+"th largest element : "+heap.peek());
    }

}