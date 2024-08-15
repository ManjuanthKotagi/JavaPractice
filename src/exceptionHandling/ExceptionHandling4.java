package exceptionHandling;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        try {
            int array[] = {1,2,3,4,5};
            System.out.println("10th element is " + array[10]); //throw error
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Exception is handled to print this line");
    }
}
