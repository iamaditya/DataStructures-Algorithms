
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        Write program to print age and name of students.
//        input :
//        aditya 12;
//        ayush 14;
//        abhinav 17;

//        Output :
//        Age of aditya is 12;
//        Age of ayush is 14;
//        Age of abhinav is 17;


        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0;i<3;i++){
            String name;
            int age;
            Scanner sc = new Scanner(System.in);
            name = sc.next();
            age = sc.nextInt();
            hm.put(name,age);
        }

        System.out.println("Age of aditya is "+hm.get("aditya"));
        System.out.println("Age of ayush is "+hm.get("ayush"));
        System.out.println("Age of abhinav is "+hm.get("abhinav"));
        System.out.println(hm);

    }
}