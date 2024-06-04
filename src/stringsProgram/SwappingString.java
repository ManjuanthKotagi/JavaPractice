package stringsProgram;

public class SwappingString {
    public static void main(String[] args) {
        String a = "coding";
        String b = "ninjas";
        System.out.println("Before Swapping " + a  +b);
        a = a+b;
        System.out.println("Concatinated String is " + a);
        System.out.println(a.length()-b.length());
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("After swap : " + a + b);
    }

    //a = codingninjas
    //b= a.length()-b.length(); 12-6
}
