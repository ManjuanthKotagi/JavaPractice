package integerPrograms;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

// Write a java program for {-1, 0, 99, 10, +199, 76, -10, 88, 145, -99} print the value in descending order
public class PrintTheArrayInDescendingOrder {
    public static void main(String[] args) {
        Integer[] numbers = {-1, 0, 99, 10, +199, 76, -10, 88, 145, -99};
        TreeSet<Integer> orderedSet = new TreeSet<>(Arrays.asList(numbers));
        System.out.println(orderedSet.descendingSet());


        //sort function
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
