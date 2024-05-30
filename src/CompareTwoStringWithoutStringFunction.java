public class CompareTwoStringWithoutStringFunction {

    //Comparison of two strings without using inbuilt function
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int ch1size = ch1.length;
        int ch2size = ch2.length;

        int i = 0, j = 0;

        //by the length of the string, if strings size are different no need of comparison
        if(ch1size!=ch2size){
            System.out.println("String size is not equal, hence strings will not be same");
            System.exit(0);
        }

        while (i < ch1size) {
            if (ch1[i] == ch2[i]) {
                i++;
            }
            else{
                System.out.println("Strings are not equal");
                System.exit(0);
            }
        }
        System.out.println("Strings are equal");

        //OR

        while(i< ch1size){
            if(ch1[i]!=ch2[i]){
                System.out.println("Strings are not equal");
                System.exit(0);
            }
            i++;
        }
        System.out.println("Strings are equal");
    }
}
