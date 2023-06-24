// In below approach i have used string, int map but instead we should use char and int map , it will reduce some code in java like String.valueOf(char);
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "aditya";
        String t = "daatyi";

        HashMap<String, Integer> hashmap = new HashMap<>();
        HashMap<String, Integer> hashmap2 = new HashMap<>();
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (hashmap.containsKey(String.valueOf(s.charAt(i)))) {
                    int el = hashmap.get(String.valueOf(s.charAt(i)));
                    hashmap.put(String.valueOf(s.charAt(i)), ++el);
                } else {
                    hashmap.put(String.valueOf(s.charAt(i)), 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                if (hashmap2.containsKey(String.valueOf(t.charAt(i)))) {
                    int el = hashmap2.get(String.valueOf(t.charAt(i)));
                    hashmap2.put(String.valueOf(t.charAt(i)), ++el);
                } else {
                    hashmap2.put(String.valueOf(t.charAt(i)), 1);
                }
            }
            System.out.println(hashmap + " \n" + hashmap2);

//            for (int i=0;i<s.length();i++){ // Good but not best
//                if(hashmap.get(String.valueOf(s.charAt(i))) == hashmap2.get(String.valueOf(s.charAt(i)))){
//
//                }else{
//                    System.out.println("false");
//                    return;
//                }
//            }
//            System.out.println("true");


            if(hashmap.equals(hashmap2)){  //better approach
                System.out.println("true");
                return;
            }else{
                System.out.println("false");
                return;
            }
        }
    }
}

