public class UpperCaseToLowerCase {

    public static void main(String[] args) {

        String x = "MANJU NATH";
        char[] y = x.toCharArray();
        int size = y.length;

        int i = 0;
        while (i != size) {
            if (y[i] != ' ') {
                y[i] = (char) (y[i] + 32);
            }
            i++;
        }

        System.out.println(x);
        System.out.println(y);
    }
}
