package integerPrograms;

import java.util.Scanner;

//Write a java program to find even and odd numbers?
public class FindOddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter the number to find even or odd");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
