package stringsProgram;

//Write a java program to copy one string to another.
public class CopyOneStringToAnother {

    public static void main(String args[]) {
        String originalStr = "I love java and Selenium";
        char[] chars = originalStr.toCharArray();
        int sizeOfStr = chars.length;
        char[] copiedChars = new char[sizeOfStr];

        for (int i = 0; i < sizeOfStr; i++) {
            copiedChars[i] = chars[i];
        }

        String copiedString = new String(copiedChars);
        System.out.println("Another copied string is : " + copiedString);
    }
}
