package exceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            int data = 500/0;
        }
        catch (ArithmeticException e){
            System.out.println("Can't be divided by zero");
        }
        System.out.println("Exception is handled to print this line");
    }
}
