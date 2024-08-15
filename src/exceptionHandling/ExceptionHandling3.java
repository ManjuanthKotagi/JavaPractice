package exceptionHandling;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            int data = 500/0;
            System.out.println("This line will not execute because exception is occurred in line no:6");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
