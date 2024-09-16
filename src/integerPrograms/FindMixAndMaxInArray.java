package integerPrograms;

//Find minimum and maximum number in the array
public class FindMixAndMaxInArray {

    public static void main(String[] args) {
        int numbers[] = {3, 4, 5, 8, 1, 9, 7};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum number " + min);
        System.out.println("Maximum number " + max);
    }
}
