package stringsProgram;

public class AllStringMethods {

    public static void main(String[] args) {
        
        String str = "I love java and Selenium";

        String str1 = "bava";
        String str2 = "Java";

        //check the length of the string
        int strLength = str.length();
        System.out.println(strLength);

        //print/access the 8th character
        char character = str.charAt(8);
        System.out.println("8th character of the string is : " + character);

        //substring usage by giving starting and ending index
        String substring = str.substring(1,6);
        System.out.println("Substring with starting and ending index " + substring);

        //substring usage by giving starting index
        String substring1 = str.substring(6);
        System.out.println("Substring with Starting index " + substring1);

        //will give you the index of the character
        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        System.out.println("Index is " + str.indexOf("l"));
        System.out.println("Index is " + str.indexOf("love"));

        if(str1.compareTo(str2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("strings are not equla");
        }





    }
}
