package stringsProgram;

import java.util.HashMap;
import java.util.Map;

//Write a java program to find the occurrence of the characters in the string
public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String str = "hello hello";
        String characters[] = str.toLowerCase().split("");
        Map<String, Integer> charCount = new HashMap();

        for (String character : characters) {
            charCount.put(character, charCount.getOrDefault(character,0) + 1);
        }

        for(Map.Entry<String, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }
    }
}
