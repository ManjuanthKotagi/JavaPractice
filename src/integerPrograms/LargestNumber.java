package integerPrograms;

//Write a java program to find the largest number?
public class LargestNumber {

    public static void main(String[] args) {
        Integer[] numbers = {10, 25, 5, 15, 35};
        int length = numbers.length;
        int largestNumber = numbers[0];

        for (int i = 0; i < length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("Largest Number is : " + largestNumber);
    }
}
