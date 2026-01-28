package integerPrograms;

import java.util.Arrays;

public class FindSecondHighestNumberFromArray {

    public static void main(String[] args) {

        Integer[] numbers = {58, 90, 56, 98, 66, 11, 78};
        Arrays.sort(numbers);
        int length = numbers.length;
        System.out.println("Second Highest Number is : " + numbers[length - 2]);
    }
}
