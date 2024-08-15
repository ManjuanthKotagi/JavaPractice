package integerPrograms;

import java.util.Scanner;

public class PrintStars {
    //Write a Java program to print stars using for loop, where the number of stars printed should be equal to the row number?
    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
