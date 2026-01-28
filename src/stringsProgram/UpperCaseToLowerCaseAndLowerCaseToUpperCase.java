package stringsProgram;

//Write a java program to convert uppercase to lowercase and lowercase to uppercase of the string
public class UpperCaseToLowerCaseAndLowerCaseToUpperCase {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    chars[i] = (char) (chars[i] + 32);
                } else {
                    chars[i] = (char) (chars[i] - 32);
                }
            }
        }
        System.out.println(chars);
    }
}
