public class IntegerStringVerification {

    public static void main(String[] args) {
        String x = "98765";
        char[] y = x.toCharArray();
        int size = y.length;
        int i = 0;
        while (i != size) {
            if (y[i] >= '0' && y[i] <= '9') {
                i++;
            } else {
                System.out.println("It's not a integer string");
                System.exit(0);
            }
        }
        System.out.println("String is an integer");
    }
}
