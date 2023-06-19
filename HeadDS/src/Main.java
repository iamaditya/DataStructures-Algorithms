import java.util.ArrayList;

public class Main {
    static class Head{
        ArrayList<Integer> a1 = new ArrayList<>();

        public void add(int data){ // total time : log n
            a1.add(data);

            int child = a1.size()-1; // child index
            int parent = (child-1)/2; // parent index

            while(a1.get(child)<a1.get(parent)){

                int temp = a1.get(child); // storing child value in temp var

                a1.set(child,a1.get(parent)); // add parent value to child index

                a1.set(parent, temp); // add child value to parent index
            }

        }

        public int peek(){
            return a1.get(0);
        }


        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int midIn = i;

            if(left<a1.size() && a1.get(midIn)> a1.get(left)){
                midIn = left;
            }

            if(right<a1.size() && a1.get(midIn)> a1.get(right)){
                midIn = right;
            }


            if(midIn!=i){
                int temp = a1.get(i);
                a1.set(i, a1.get(midIn));
                a1.set(midIn, temp);

                heapify(midIn);
            }
        }

        public int remove(){
            int data = a1.get(0);

//            step 1 - swap first & last
            int temp = a1.get(0);
            a1.set(0,a1.get(a1.size()-1));
            a1.set(a1.size()-1, temp);

//            Step 2 - delete list
            a1.remove(a1.size()-1);

//            Step 3 - Heapify
            heapify(0);
            return data;


        }
    }
    public static void main(String[] args) {

    }
}