package stringsProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepetitiveAndNonRepetitiveWords {
    public static void main(String[] args) {
        String str = "I am Manjunath Manjunath am";
        String words[] = str.split(" ");
        Set<String> repetitiveWords = new LinkedHashSet<>();
        Set<String> nonRepetitiveWords = new LinkedHashSet<>();

        for(String word : words) {
            String uniqueWord = word;
            if(nonRepetitiveWords.contains(uniqueWord)) {
                //nonRepetitiveWords.remove(uniqueWord);
                repetitiveWords.add(uniqueWord);
            } else {
                nonRepetitiveWords.add(uniqueWord);
            }
        }

        System.out.println("Repetitive Words: " + repetitiveWords);
        System.out.println("NonRepetitive Words: " + nonRepetitiveWords);
    }
}
