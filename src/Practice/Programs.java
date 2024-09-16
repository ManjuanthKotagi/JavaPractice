package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Programs {

    public static void main(String[] args) {

        int a[]={32,16,18,9,7,3};

        TreeSet nums = new TreeSet();
        //nums.add(a);
        nums.add(32);
        nums.add(16);
        nums.add(18);
        nums.add(9);
        nums.add(7);
        nums.add(3);


        Iterator itr = nums.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

