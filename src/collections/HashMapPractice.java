package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, String> person = new HashMap<>();
        person.put("name", "Manjunath");
        person.put("Age", "33");
        person.put("City", "Bangalore");
        person.put("emailId", "man@gmail.com");

        System.out.println("Iterating Using a For-Each Loop");
        for(Map.Entry m:person.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
