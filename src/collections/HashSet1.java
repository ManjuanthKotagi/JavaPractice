package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();
        hashset.add("One");
        hashset.add("Two");
        hashset.add("Three");
        hashset.add("Four");

        Iterator iterator = hashset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("________________________________________");
        //Creating hashset with duplicate element
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("Mango");
        hashset1.add("Mango");
        hashset1.add("Grapes");
        hashset1.add("Pineapple");

        Iterator iterator1 = hashset1.iterator();
        //Checking whether duplicate elements are present or not
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("______________________________________");
        for(String fruits : hashset1) {
            System.out.println(fruits);

        }
    }
}
