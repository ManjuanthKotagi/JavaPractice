package stringsProgram;

//Write a java program to check whether the string contains only digits or not?
//if 98765 then pass it, if 98765jk then fail it
public class IntegerStringVerification {

    public static void main(String[] args) {
        String str = "98765";  //98765 pass //98765*&^fail  //98765h fail
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(chars[i])) {
                System.out.println("String contains some characters other than digits");
                System.exit(0);
            }
        }
        System.out.println("String contains only digits");
    }
}