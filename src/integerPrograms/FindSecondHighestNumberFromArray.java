package integerPrograms;

import java.util.Arrays;

public class FindSecondHighestNumberFromArray {

    public static void main(String[] args) {

        int numbers[] = {58, 90, 56, 98, 66, 11, 78};
        //first we need to sort it by using sort function;
        Arrays.sort(numbers);
        //take the length;
        int length = numbers.length;
        for(int i=0;i<length;i++) {
            System.out.println("Numbers is : " + numbers[i]);
        }
        System.out.println("Second Highest Number is : " + numbers[length-2]);

        System.out.println("Smallest Number is : " + numbers[0]);
    }
}
