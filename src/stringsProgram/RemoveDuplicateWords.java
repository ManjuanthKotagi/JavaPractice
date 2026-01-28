package stringsProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Write a java program to remove duplicate words from the string
public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String str = "I am a software test engineer software test engineer";
        String[] words = str.split(" ");
        Set<String> uniqueWordSet = new LinkedHashSet<>(Arrays.asList(words));
        StringBuffer uniqueWordString = new StringBuffer();

        for (String word : uniqueWordSet) {
            uniqueWordString = uniqueWordString.append(" " + word);
        }

        System.out.println(uniqueWordString);
    }
}
