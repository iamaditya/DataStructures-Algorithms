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

        // Traverse the ll and looks for a node with key, if found return index else -1
        private int searchInBucket(LinkedList<Node> ll, K key){
                for (int i=0; i<ll.size();i++){
                    if(ll.get(i).key == key){
                        return i;
                    }
                }

                return -1;
        }
        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }
        public int size(){ // return size of hashmap

            return n;
        }

        public void put(K key, V value){ // used to insert / update entries
            int bi = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];

            int el = searchInBucket(currBucket, key);

            if(el == -1){ // key does not exist adding new Node
                Node node  = new Node(key,value);
                currBucket.add(node);
                n++;
            }else{ // update case
                Node currNode = currBucket.get(el);
                currNode.value = value;
            }

        }

        public V get(K key){

            int bi = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);

            if(ei != -1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
                return null;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> hm = new MyHashMap<>();
        System.out.println("Testing PUT: ");
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("f",3);
        hm.put("g",3);
        hm.put("h",3);
        hm.put("i",3);
        hm.put("d",4);
        System.out.println("Map Size : "+hm.size());
        hm.put("d", 50);
        System.out.println("Map Size : "+hm.size());

        System.out.println("Map.get() - > "+hm.get("d"));
        System.out.println("Map.get() -> "+hm.get("x"));
        System.out.println(hm.remove("d"));

        System.out.println(hm.remove("d"));

        System.out.println("New Size : "+hm.size());
    }
}
