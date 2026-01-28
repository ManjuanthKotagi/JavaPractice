package stringsProgram;

//Write a java program to split the words into characters and print in new line
public class SplitTheWordsIntoCharacters {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        char[] ch = str.toCharArray();
        int length = ch.length;

        for (int i = 0; i < length; i++) {
            System.out.println(ch[i]);
        }
    }
}
