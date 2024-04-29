public class StringContainsUniqueChar {

    public static void main(String[] args) {
        String x = "AB";
        char[] y = x.toCharArray();
        int size = y.length;
        int i = 0;
        while (i != size) {
            int j = i+1;
            while (j != size) {
                if (y[i] != y[j]) {
                    j++;
                } else {
                    System.out.println("String doesn't contain unique characters");
                    System.exit(0);
                }
            }
            i++;
        }
        System.out.println("String contains unique characters");
    }

}
