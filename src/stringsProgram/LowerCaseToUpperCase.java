package stringsProgram;

//Write a java program for lowercase to uppercase.
public class LowerCaseToUpperCase {

    public static void main(String[] args) {
        String str = "java programming";
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {                  //to check spacing and storing as it is.
                chars[i] = (char) (chars[i] - 32);
            }                                      //lowercase = uppercase_letter+32; //Uppercase = lowercase_letter-32
        }
        System.out.println(str);
        System.out.println(chars);
    }
}