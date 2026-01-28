package stringsProgram;

//Write a java program to remove the space in between the string
public class RemoveSpaceInString {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        char[] chars = str.toCharArray();
        int length = chars.length;
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }

        System.out.println("spaceCount" + spaceCount);

        char[] updatedChars = new char[length - spaceCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                updatedChars[index] = chars[i];
                index++;
            }
        }
        System.out.println(str);
        System.out.println(updatedChars);
    }
}