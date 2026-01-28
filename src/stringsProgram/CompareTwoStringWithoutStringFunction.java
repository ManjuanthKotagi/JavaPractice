package stringsProgram;

//Write a java program to compare two strings without using strings function
public class CompareTwoStringWithoutStringFunction {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int ch1size = ch1.length;
        int ch2size = ch2.length;

        //by the length of the string, if strings size are different no need of comparison
        if (ch1size != ch2size) {
            System.out.println("String size is not equal, hence strings will not be same");
            System.exit(0);
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("Strings are not equal");
                System.exit(0);
            }
        }
        System.out.println("Strings are equal");
    }
}
