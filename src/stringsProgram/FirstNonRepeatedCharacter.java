package stringsProgram;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbbcddeff";
        char nonRepeatedCh = findNonRepeatedCharacter(str);
        System.out.println(nonRepeatedCh);
    }

    private static char findNonRepeatedCharacter(String str) {
        int[] count = new int[256];
        for(char ch : str.toCharArray()) {
            count[ch]++;
        }

        for(char ch : str.toCharArray()) {
            if(count[ch] == 1) {
                return ch;
            }
        }
        return 0;
    }
}
