package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //adding elements in the list
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //iterating and displaying the list
        for (String fruits : list) {
            System.out.println(fruits);
        }

        //accessing the elements
        System.out.println("Returning the elements: " + list.get(1));

        //Changing the elements
        list.set(1, "Dates");
        System.out.println("Displaying the elements after seeting");
        for (String fruits : list) {
            System.out.println(fruits);
        }

        //Sorting the list
        Collections.sort(list);
        System.out.println("List after sorting is : ");
        for (String fruits : list) {
            System.out.println(fruits);
        }

        ListIterator itr = list.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()) {
            System.out.println("index : " + itr.nextIndex() + " and value : " + itr.next());
        }

        System.out.println("Traversing elements in backward direction");
        while (itr.hasPrevious()) {
            System.out.println("index : " + itr.previousIndex() + " and value : " + itr.previous());
        }

        System.out.println("Some methods of lists");
        System.out.println("Size of the list " + list.size());
        System.out.println("Check list is empty or not " + list.isEmpty());
        System.out.println("Check the element from index " + list.indexOf("Mango"));
        System.out.println("Check the element is present of not " + list.contains("Mango"));

        System.out.println("Check the All the elements are present or not ");
        List<String> duplicateList = new ArrayList<String>(list);
        System.out.println(duplicateList.containsAll(list));
    }
}
