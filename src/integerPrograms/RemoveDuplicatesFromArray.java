package integerPrograms;

import java.util.LinkedHashSet;

//remove duplicate elements from the array
public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int array[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};

        LinkedHashSet<Integer> uniqueArray = new LinkedHashSet<>();

        for(int i=0;i<array.length;i++) {
            uniqueArray.add(array[i]);
        }

        System.out.println(uniqueArray);
    }
}
