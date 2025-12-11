package integerPrograms;

public class FindSecondLargestNumberWithoutUsingAnyFunction {

    public static void main(String[] args) {
        Integer[] numbers = {5, 9, 7, 6, 7, 3, 8};
        int length = numbers.length;
        int largestNumber = 0;
        int secondLargestNumber = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] >= largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers[i];
            } else {
                if (numbers[i] >= secondLargestNumber) {
                    secondLargestNumber = numbers[i];
                }
            }
        }
        System.out.println("Second largest number is : " + secondLargestNumber);
    }
}