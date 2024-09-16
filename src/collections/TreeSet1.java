package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<String> treeset=new TreeSet<String>();
        treeset.add("Ravi");
        treeset.add("Vijay");
        treeset.add("Ravi");
        treeset.add("Ajay");
        //Traversing elements
        Iterator<String> itr=treeset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=treeset.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

