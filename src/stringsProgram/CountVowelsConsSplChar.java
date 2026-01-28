package stringsProgram;

//Write a java program to count the vowels, consonants and special characters
public class CountVowelsConsSplChar {

    public static void main(String[] args) {

        String str = "abc&";
        char[] chars = str.toUpperCase().toCharArray();
        int length = chars.length;
        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                vowelsCount++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                consonantsCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Vowels Counts : " + vowelsCount);
        System.out.println("Consonants Counts : " + consonantsCount);
        System.out.println("Special Characters Counts : " + specialCharCount);
    }
}
