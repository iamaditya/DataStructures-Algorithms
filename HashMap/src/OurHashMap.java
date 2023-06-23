import java.util.LinkedList;

public class OurHashMap {
    static class MyHashMap<K,V>{

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;


        private class Node{
        K key;
        V value;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }

        }

        int n; // no of entries in map
        private LinkedList<Node>[] buckets;

        private void initBucket(int N){ // N - capacity / size of buckets arrray

            buckets = new LinkedList[N];
                for (int i=0;i<buckets.length;i++){
                    buckets[i] = new LinkedList<>();
                }
        }
        private int HashFunction(K key){

            int mac = key.hashCode();

            return (Math.abs(mac))%buckets.length;
        }
        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }
        public int size(){ // return size of hashmap

            return 0;
        }

        public void put(K key, V value){ // used to insert / update entries
            int bi = HashFunction(K key);

        }

        public V get(K key){
//            return ;
            V valuex = null;
            return valuex;
        }

        public V remove(K key){
            V xvalue = null;
            return xvalue;
        }
    }
    public static void main(String[] args) {
        MyHashMap<Integer,Integer> hm = new MyHashMap<>();


        }
}
