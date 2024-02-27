public class ReverseTheString {

    public static void main(String[] args) {
        String originalStr = "I love java";
        char originalCha[] = originalStr.toCharArray();
        int lengthOfCha = originalCha.length;
        //create another char array characters in reverse order
        char reverseCha[] = new char[lengthOfCha];
        int i = 0;
        while (i!=lengthOfCha) {
            reverseCha[lengthOfCha-1-i] = originalCha[i];
            i++;
        }
        String reverseString = new String(reverseCha);
        System.out.println(originalStr);
        System.out.println(reverseString);
        System.out.println(originalStr.length());
    }
}
