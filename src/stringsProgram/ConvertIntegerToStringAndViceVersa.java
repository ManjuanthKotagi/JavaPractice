package stringsProgram;

public class ConvertIntegerToStringAndViceVersa {

    //Convert Integer to String and String to Integer
    public static void main(String[] args) {
        String string1 = "123456";
        String string2 = "121212";

        //convert string to integer by using parseInt
        Integer num1 = Integer.parseInt(string1);
        if(num1 instanceof Integer){
            System.out.println("It is integer string ");
        }

        //convert string to integer by using valueOf
        Integer num2 = Integer.valueOf(string1);
        if(num2 instanceof Integer){
            System.out.println("It is integer string ");
        }

        //convert integer to string by using valueOf
        String str3 = String.valueOf(num1);
        if(str3 instanceof String){
            System.out.println("It is a string");
        }

        //convert integer to string by using toString()
        String str4 = num2.toString(); //String str4 = Integer.toString(num2)
        if(str4 instanceof String){
            System.out.println("It is a string");
        }
    }
}
