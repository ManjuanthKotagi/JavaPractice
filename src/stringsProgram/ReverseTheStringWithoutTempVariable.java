package stringsProgram;

public class ReverseTheStringWithoutTempVariable {

    //Reverse the string without using temp variable. (Its completely pointer bases)
    public static void main(String[] args) {
        String str = "Welcome to Java";
        char x[] = str.toCharArray();
        int size = x.length;
        int i=0;
        int j=size-1;
        while(i<j){
            x[i] ^= x[j];
            x[j] ^= x[i];
            x[i] ^= x[j];
            i++;
            j--;
        }
        String reversedString = new String(x);
        System.out.println("Original String " + str);
        System.out.println("Reversed String " + reversedString);
    }
}
