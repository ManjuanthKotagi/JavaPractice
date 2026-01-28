package stringsProgram;

//length of the string without using length function;
//Write a java program to find the length of the string
public class LengthOfTheString {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        str = str.concat("\0");
        char[] chars = str.toCharArray();
        int length = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\0') {
                length = length + 1;
            }
        }
        System.out.println("Length of the String is : " + length);
    }
}
