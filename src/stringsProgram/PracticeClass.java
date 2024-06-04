package stringsProgram;

import javax.sound.midi.Soundbank;

public class PracticeClass {

    public static void main(String[] args) {
        String str1 = "Cypress";
        String str2 = "Selenium";
        str1 = str1+str2;
        System.out.println("Concatenated string is " + str1);
        System.out.println("Str Length " + str1.length());

        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("Swapped String Str1 : " + str1);
        System.out.println("Swapped String Str2 : " + str2);
    }
}
