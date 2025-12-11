package integerPrograms;

import java.util.Arrays;

public class PushAllTheZerosAtTheBeginningByFunction {

    public static void main(String[] args) {
        Integer[] numbers = {2, 3, 0, 7, 9, 0, 6, 0};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
