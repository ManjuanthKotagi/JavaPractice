package integerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {

        System.out.println("Enter the number of inputs you would like to do sum");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer number[] = new Integer[n];
        int evenNumSum =0;
        int oddNumSum = 0;
        System.out.println("Enter the numbers one by one");
        for (int i = 0; i < n; i++) {
            number[i] = scan.nextInt();
        }

        System.out.println("Entered numbers are " + Arrays.toString(number));
        for (int i = 0; i < number.length; i++){
            if(number[i]%2==0){
                evenNumSum = evenNumSum + number[i];
            }
            else{
                oddNumSum = oddNumSum + number[i];
            }
        }
        System.out.println("Sum of Even Numbers " + evenNumSum);
        System.out.println("Sum of odd Numbers " + oddNumSum);
    }
}
