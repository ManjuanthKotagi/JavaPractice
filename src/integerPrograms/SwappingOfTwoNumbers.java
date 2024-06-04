package integerPrograms;

public class SwappingOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        num1 = num1+num2;
        System.out.println("Num1 " + num1);

        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swapping num1 is " + num1 + " and num2 is " + num2);
    }
}
