package lambdaExpression;

public class SimpleProgram {

    public static void main(String[] args) {
        //Normal Approach
        Addition addition = new Addition();
        int sum = addition.add(2, 3);
        System.out.println("Sum of two numbers is : " + sum);

        //By using lambda expression, without creating the class(Addition class) we can make use of interface
        ArithmeticOperations arithmeticOperations = (a, b) -> (a + b);
        int sum1 = arithmeticOperations.add(2, 3);
        System.out.println("Sum of two numbers is : " + sum1);
    }
}
