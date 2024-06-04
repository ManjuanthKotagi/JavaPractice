package stringsProgram;

public class LengthOfTheString {
    //length of the string without using length function;
    public static void main(String[] args) {

        String str = "I Love Java";
        str = str.concat("\0");
        char[] x = str.toCharArray();
        int i=0;
        int length = 0;
        while(x[i]!='\0'){
            length++;
            i++;
        }
        System.out.println("Lenth of the String is : " + length);
    }
}
