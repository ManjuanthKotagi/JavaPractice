package stringsProgram;

//Write a java program to count the characters, special characters, and integers
public class CountChSpecialChAndIntegerCh {

    public static void main(String args[]) {
        String str = "12Yut6Gfs $th^7";
        char[] chars = str.toCharArray();
        int length = chars.length;

        int charCount = 0;
        int specialChar = 0;
        int integerCount = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z' || chars[i] >= 'a' && chars[i] <= 'z') {
                charCount++;
            } else if (chars[i] >= '1' && chars[i] <= '9') {
                integerCount++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Char count is " + charCount);
        System.out.println("Special Char count is " + specialChar);
        System.out.println("Integer count is " + integerCount);
    }
}
