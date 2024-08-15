package exceptionHandling;

public class ExceptionHandling5 {
    //Handling exception through multiple catch block
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //exception occurs and next line will not execute
            System.out.println("This line will not execute");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurs");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }
        System.out.println("Rest of the code");
    }
}
