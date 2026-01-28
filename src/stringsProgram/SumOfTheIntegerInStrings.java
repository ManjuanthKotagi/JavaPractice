package stringsProgram;

//Write a java program to find the sum of the integers in the given string ”jklp62785lk”?
public class SumOfTheIntegerInStrings {

    public static void main(String[] args) {
        String str = "jklp62785lk";
        char[] chars = str.toCharArray();
        int length = chars.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(chars[i])) {
                int number = Integer.parseInt(String.valueOf(chars[i]));
                sum = sum + number;
            }
        }
        System.out.println("Sum of the integers in the string is : " + sum);
    }
}
