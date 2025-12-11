package integerPrograms;

public class FindPrimeNumberOrNot {

    public static void main(String[] args) {
        int number = 8;
        int count = 0;

        for (int i = 0; i < number; i++) {
            if (number % 2 == 0) {
                count = count + 1;
            }
        }

        if (count <= 2) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }
    }
}