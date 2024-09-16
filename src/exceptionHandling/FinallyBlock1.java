package exceptionHandling;

public class FinallyBlock1 {
    public static void main(String[] args) {
        try {
            int a = 500/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurs and it is catched");
        }
        finally {
            System.out.println("Finally block will always be executed");
        }
    }
}
