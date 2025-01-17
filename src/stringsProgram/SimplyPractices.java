package stringsProgram;

public class SimplyPractices {
    public static void main(String[] args) {
        String str1 = "MANJU";
        char ch[] = str1.toCharArray();
        int size = ch.length;

        for (int i = 0; i < size; i++) {
            ch[i] = (char) (ch[i] +  32);
        }
        System.out.println(ch);
    }
}