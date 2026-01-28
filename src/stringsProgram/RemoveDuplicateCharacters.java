package stringsProgram;

import java.util.LinkedHashSet;
import java.util.Set;

//Write a java program to remove duplicate letters(characters) from the string?
public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "aabbccddeeffghijklmn";
        char[] chars = str.toCharArray();
        Set<Character> charset = new LinkedHashSet<>();
        StringBuffer uniqueCharString = new StringBuffer();

        for (Character ch : chars) {
            charset.add(ch);
        }

        for (Character ch : charset) {
            uniqueCharString = uniqueCharString.append(ch);
        }

        System.out.println(uniqueCharString);
    }
}
