public class Palindrome {

    public static void main(String[] args) {
        String originalStr = "Gadag";
        char originalCha[] = originalStr.toCharArray();
        int lengthOfCha = originalCha.length;
        //create another char array characters in reverse order
        char reverseCha[] = new char[lengthOfCha];
        int i = 0;
        while (i != lengthOfCha) {
            reverseCha[lengthOfCha - 1 - i] = originalCha[i];
            i++;
        }
        i = 0;
        while(i!=lengthOfCha){
            if(originalCha[i]!=reverseCha[i])
            {
                System.out.println("String is not a palindrome");
                System.exit(0);
            }
            else{
                i++;
                continue;
            }
        }
        System.out.println("String is palindrome");
    }
}
