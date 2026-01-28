package stringsProgram;

//Write a java program  for reverse the string
public class ReverseTheString {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        char[] chars = str.toCharArray();
        int lengthOfCha = chars.length;
        //create another char array characters in reverse order
        char[] reverseChars = new char[lengthOfCha];

        for (int i = 0; i < lengthOfCha; i++) {
            reverseChars[lengthOfCha - 1 - i] = chars[i];
        }

        System.out.println(str);
        System.out.println(reverseChars);
    }
}
