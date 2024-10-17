package integerPrograms;


import java.util.Arrays;

public class FindDistinctElementsFromArray {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 8, 7, 1, 2, 3, 4, 5, 6, 7};
        int length = numbers.length;
        Arrays.sort(numbers);
        for (int i = 0; i < length; i++) {
            while (i < length - 1 && numbers[i] == numbers[i + 1]) {
                i++;
            }
            System.out.println(numbers[i]);
        }
    }
}
