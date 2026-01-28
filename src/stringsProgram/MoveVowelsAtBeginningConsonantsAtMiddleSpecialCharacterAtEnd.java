package stringsProgram;

//Write a program to move vowels at the beginning, consonants at the middle and special characters at the end.
public class MoveVowelsAtBeginningConsonantsAtMiddleSpecialCharacterAtEnd {

    public static void main(String args[]) {
        String str = "java$6@Prog#@*ramming";
        char[] chars = str.toCharArray();
        int length = chars.length;
        StringBuffer vowels = new StringBuffer();
        StringBuffer consonants = new StringBuffer();
        StringBuffer specialCharacter = new StringBuffer();
        StringBuffer sortedString = new StringBuffer();

        for (int i = 0; i < length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                Character ch = chars[i];
                vowels = vowels.append(ch);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                Character ch = chars[i];
                consonants = consonants.append(ch);
            } else {
                Character ch = chars[i];
                specialCharacter = specialCharacter.append(ch);
            }
        }

        sortedString = vowels.append(consonants).append(specialCharacter);

        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(specialCharacter);

        System.out.println("Sorted string is : " + sortedString);
    }
}
