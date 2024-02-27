public class LowerCaseToUpperCase {

    public static void main(String[] args) {
        String x = "manju nath";
        char[] y = x.toCharArray();
        int size = y.length;

        int i = 0;
        while (i != size) {
            if (y[i] != ' ') {                  //to check spacing and storing as it is.
                y[i] = (char) (y[i] - 32);
            }
            i++;                                //lowercase = uppercase_letter+32; //Uppercase = lowercase_letter-32
        }
        System.out.println(x);
        System.out.println(y);
    }
}
