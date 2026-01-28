package stringsProgram;

public class CompareTwoStrings {

    //Comparison of string by using inbuilt function
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        //Comparison by content of the length
        if (str1.equals(str2)) {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are not equal");
        }

        //Comparison by memory location of the string
        if (str1 == str2) {
            System.out.println("Strings memory location is same");
        } else {
            System.out.println("Strings memory location is not same");
        }
    }
}
