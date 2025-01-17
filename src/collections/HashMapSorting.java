package collections;

import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {

        HashMap studentRecords = new HashMap();

        studentRecords.put("A", 34);
        studentRecords.put("B", 40);
        studentRecords.put("C", 25);
        studentRecords.put("X", 15);
        studentRecords.put("Y", 84);

        //Sort the map values by ascending order
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(studentRecords.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        System.out.println("Ascending Order ");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //Sort the map values by descending order
        entryList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println("Descending Order ");
        for(Map.Entry<String, Integer> entry:entryList) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
