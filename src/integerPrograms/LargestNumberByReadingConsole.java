package integerPrograms;

import java.util.Scanner;

public class LargestNumberByReadingConsole {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array to find the largest number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int numbers[] = new int[n];

        System.out.println("Enter the numbers one by one");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        int largestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largestNumber){
                largestNumber = numbers[i];
            }
        }
        System.out.println("Largest Number Is : " + largestNumber );
    }
}
