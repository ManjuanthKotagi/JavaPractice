package stringsProgram;

//Write a java program to convert first letter of the word as uppercase
public class FirstLetterUpperCase {

    public static void main(String[] args) {

        String str = "java programming language";
        char[] chars = str.toCharArray();
        int length = chars.length;
        chars[0] = (char) (chars[0] - 32);

        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = (char) (chars[i + 1] - 32);
            }
        }
        System.out.println(str);
        System.out.println(chars);
    }
}