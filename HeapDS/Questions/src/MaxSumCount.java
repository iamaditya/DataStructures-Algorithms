import java.util.ArrayList;
import java.util.PriorityQueue;

public class MaxSumCount {
    //maximum sum count problem using heap
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        int k =3;

        a1.add(4);
        a1.add(2);
        a1.add(5);
        a1.add(1);

        a2.add(8);
        a2.add(0);
        a2.add(3);
        a2.add(5);

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b)->b-a);
        for (int i=0;i<a1.size();i++){
            for (int j =0;j<a2.size();j++){
                heap.add(a1.get(i)+a2.get(j));
            }
        }
        System.out.print("Max Sum are : ");
        for (int i=0;i<k;i++){
            System.out.print(heap.peek()+" ");
            heap.remove();
        }

    }
}
