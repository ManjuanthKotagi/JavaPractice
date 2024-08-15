package exceptionHandling;


//If the exception type is not matched then parent exception will be called
public class ExceptionHandling6 {
    public static void main(String[] args) {
        try{
            int data =500/0;  //causes ArithmeticException but it is not defined so parent exception will execute
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException occurred");
        }
        catch (Exception e)
        {
            System.out.println("ParentException will be called");
        }
    }
}
