package integerPrograms;

public class FindLargestNumberWithoutUsingAnyFunction {

    public static void main(String[] args) {
        Integer[] numbers = {1, 7, 9, 4, 2, 7, 9};
        int length = numbers.length;
        int largestNumber = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] >= largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("Largest Number is : " + largestNumber);
    }
}
