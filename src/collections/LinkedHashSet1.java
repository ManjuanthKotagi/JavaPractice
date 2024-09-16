package collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

    public static void main(String[] args) {
        LinkedHashSet<String> hashset = new LinkedHashSet<>();
        hashset.add("One");
        hashset.add("Two");
        hashset.add("Three");
        hashset.add("Four");

        Iterator iterator = hashset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("________________________________________");
        //Creating linked hashset with duplicate element
        LinkedHashSet<String> linkedHashset1 = new LinkedHashSet<>();
        linkedHashset1.add("Mango");
        linkedHashset1.add("Mango");
        linkedHashset1.add("Grapes");
        linkedHashset1.add("Pineapple");

        Iterator iterator1 = linkedHashset1.iterator();
        //Checking whether duplicate elements are present or not
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("______________________________________");
        for(String fruits : linkedHashset1) {
            System.out.println(fruits);

        }
    }
}
