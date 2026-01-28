package integerPrograms;

import java.util.LinkedHashSet;

//Write a java program to remove duplicate elements from the given array {1,1,2,2,3,3,4,4,5,6,7,8,9}
public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int array[] = {1,1,2,2,3,3,4,4,5,6,7,8,9};

        LinkedHashSet<Integer> uniqueArray = new LinkedHashSet<>();

        for(int i=0;i<array.length;i++) {
            uniqueArray.add(array[i]);
        }

        System.out.println(uniqueArray);
    }
}
