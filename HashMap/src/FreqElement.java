import java.util.HashMap;
import java.util.Map;

public class FreqElement {
    public static void main(String[] args) {
        int j= 1;
        int arr[] = {1,2,3,5,1,5,3,87,1,3,6,8,0,1,5,5,5,1,1,3,3,3,3,3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
            int e = hm.get(arr[i]);
            hm.put(arr[i],++e);
            }else{
                hm.put(arr[i],1);
            }
        }
    int temp = 0;
    for(var x : hm.values()){
    if(x>temp){
        temp = x;
    }

    }
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == temp){

                System.out.println("Hightest Frequency is : "+entry.getKey()+" "+" - "+entry.getValue());
            }
        }
    }
}
