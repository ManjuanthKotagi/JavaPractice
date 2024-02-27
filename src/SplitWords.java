import java.util.Arrays;

public class SplitWords {

    public static void main(String[] args) {
        String str = "I love java and Selenium";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println("Split of the string is: " + words[i]);
        }
        System.out.println(words.length);
        for(String words1 : words){
            System.out.println("Split of the string is: " + words1);
        }
    }
}

