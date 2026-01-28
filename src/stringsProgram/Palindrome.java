package stringsProgram;

//Write a java program to check its palindrome or not?
public class Palindrome {

    public static void main(String[] args) {
        String str = "racecar";
        char[] chars = str.toCharArray();
        int length = chars.length;       //create another char array characters in reverse order
        char[] reverseChars = new char[length];

        for (int i = 0; i < length; i++) {
            reverseChars[length - 1 - i] = chars[i];
        }

        for (int i = 0; i < length; i++) {
            if (chars[i] != reverseChars[i]) {
                System.out.println("String is not a palindrome");
                System.exit(0);
            }
        }

        System.out.println("String is a palindrome");
    }
}

