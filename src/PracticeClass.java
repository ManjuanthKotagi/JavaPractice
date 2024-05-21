import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PracticeClass {

    public static void main(String[] args) {
        String str = "abcdefg";
        char[] x = str.toCharArray();
        int size = x.length;
        int i = 0, j = 0;
        while (i < size) {
            j = i + 1;
            while (j < size) {
                if (x[i] != x[j]) {
                    j++;
                }
                else{
                    System.out.println("String doesn't contain unique char");
                    System.exit(0);
                }
            }
            i++;
        }
        System.out.println("String contain unique characters");

    }

}
