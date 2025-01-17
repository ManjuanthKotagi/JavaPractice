package stringsProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepetitiveAndRepetitiveCharacter {

    public static void main(String[] args) {
        String str = "ManjunathM"; // Input string
        char[] ch = str.toCharArray();
        int size = ch.length;

        // Set to store non-repeating characters
        Set<Character> nonRepeatedChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new LinkedHashSet<>();

        // Logic to find non-repeating characters
        for (int i = 0; i < size; i++) {
            char currentChar = ch[i];
            if (nonRepeatedChars.contains(currentChar)) {
                // If it's already in non-repeated, move it to repeated set
                nonRepeatedChars.remove(currentChar);
                repeatedChars.add(currentChar);
            } else {
                // Add to non-repeated set
                nonRepeatedChars.add(currentChar);
            }
        }

        // Output the non-repeating characters
        System.out.println("Non-repeating characters: " + nonRepeatedChars);
        System.out.println("Repetitive Characters : " + repeatedChars);
    }
}
