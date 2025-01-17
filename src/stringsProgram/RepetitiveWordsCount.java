package stringsProgram;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveWordsCount {

    public static void main(String[] args) {
        String str = "Hello World hello Shiva world world";
        str.toLowerCase();
        String words[] = str.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap();
        for (String word: words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey()  + ":" + entry.getValue());
        }
    }
}
