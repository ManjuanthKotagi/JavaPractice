package stringsProgram;

public class FirstLetterUpperCase {

    public static void main(String[] args) {

        String x = "in time tec";
        char[] y = x.toCharArray();
        int length = y.length;
        y[0] = (char) (y[0] - 32);
        int i = 1;
        while (i != length) {
            if (y[i] == ' ') {
                y[i + 1] = (char) (y[i + 1] - 32);
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
