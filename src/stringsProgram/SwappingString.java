package stringsProgram;

//Write a java program to swap two strings without using temp variables.
public class SwappingString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        System.out.println("Before Swapping " + str1 + str2);

        str1 = str1 + str2;
        System.out.println("Concatenated String is " + str1);

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swaping str1 : " + str1);
        System.out.println("After swaping str2 : " + str2);
    }
}