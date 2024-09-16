package exceptionHandling;

public class FinallyBlock2 {
    public static void main(String[] args) {
        try{
            int a = 500/5;
        }
        catch(ArithmeticException e) {
            System.out.println("Exception will not come and this block will not execute");
        }
        finally {
            System.out.println("Finally block will always execute");
        }
    }
}
