package stringsProgram;

// Write a java program to check String contains unique characters or not?
public class StringContainsUniqueChar {

    public static void main(String[] args) {
        String str = "abcdafghi";
        char[] ch = str.toCharArray();
        int length = ch.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("Characters are repeated in string");
                    System.exit(0);
                }
            }
        }
        System.out.println("String contains unique characters");
    }
}
