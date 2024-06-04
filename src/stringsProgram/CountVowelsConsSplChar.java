package stringsProgram;

public class CountVowelsConsSplChar {

    public static void main(String[] args) {

        String x = "I Love java And Selenium";
        char[] y = x.toCharArray();
        int size = y.length;
        int vowelcnt = 0;
        int conscnt = 0;
        int splcnt = 0;
        //convert all the letters to uppercase or lowercase
        int i = 0;
        while (i != size) {
            if (y[i] != ' ') {
                if (y[i] >= 'a' && y[i] <= 'z') {
                    y[i] = (char) (y[i] - 32);
                }
            }
            i++;
        }
        i=0;
        while (i != size) {
            if (y[i] != 'A' && y[i] <= 'Z') {
                if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
                 vowelcnt++;
                 i++;
                }
                else{
                    conscnt++;
                    i++;
                }
            }
            else {
                splcnt++;
                i++;
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println("Vowels Are: " + vowelcnt);
        System.out.println("Consonants Are: " + conscnt);
        System.out.println("Special Characters Are: " + splcnt);
    }
}
