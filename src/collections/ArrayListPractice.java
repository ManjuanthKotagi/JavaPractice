package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPractice {

    public static void main(String[] args) {
        //
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Kannada");
        languages.add("English");
        languages.add("Hindi");

        System.out.println(languages);
        System.out.println(languages.size());

        System.out.println("Iterate through ArrayList using for loop");
        for (int i=0;i<languages.size();i++){
            System.out.println("Elements are " + languages.get(i));
        }

        System.out.println("Iterate through ArrayList using for-each loop");
        for (String language : languages) {
            System.out.println("Elements are " + language);
        }

        System.out.println("Iterate over ArrayList using listIterator() ");
        ListIterator iterator = languages.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ",");
        }
    }
}
