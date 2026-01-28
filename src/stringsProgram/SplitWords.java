package stringsProgram;

//Write a java program to split the words and print one by one in newline
public class SplitWords {

    public static void main(String[] args) {
        String str = "I love java and Selenium";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}

