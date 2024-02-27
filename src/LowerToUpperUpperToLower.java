public class LowerToUpperUpperToLower {

    public static void main(String[] args) {

        String x = "MaNjU naTH";
        char[] y = x.toCharArray();
        int size = y.length;

        int i = 0;
        while (i != size) {
            if (y[i] != ' ')
            {
                if (y[i] >= 'a' && y[i] <= 'z') {
                    y[i] = (char) (y[i] - 32);
                } else if (y[i] >= 'A' && y[i] <= 'Z') {
                    y[i] = (char) (y[i] + 32);
                }
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}



