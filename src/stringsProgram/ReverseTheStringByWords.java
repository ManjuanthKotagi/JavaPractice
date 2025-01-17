package stringsProgram;

public class ReverseTheStringByWords {

    public static void main(String[] args) {
        String str = "I am Manjunath Kotagi";
        String[] words = str.split(" ");
        int size = words.length;
        StringBuilder reversedString = new StringBuilder();

        System.out.println(size);

        for(int i=size-1;i>=0;i--) {
            //System.out.println(words[i]);
            reversedString.append(words[i]).append(" ");
        }
        System.out.println("Reversed String is " + reversedString);
    }
}
