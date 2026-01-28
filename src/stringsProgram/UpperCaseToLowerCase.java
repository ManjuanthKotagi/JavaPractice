package stringsProgram;

//Write a java program for uppercase to lowercase.
public class UpperCaseToLowerCase {

    public static void main(String[] args) {

        String str = "JAVA PROGRAMMING";
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.println(str);
        System.out.println(chars);
    }
}