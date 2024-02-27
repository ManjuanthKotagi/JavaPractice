public class CopyOneStringToAnother {

    public static void main(String args[]) {
        String originalStr = "I love java and Selenium";
        char originalCh[] = originalStr.toCharArray();
        int sizeOfStr = originalCh.length;
        //create another char array characters in reverse order
        char anotherCh[] = new char[sizeOfStr];
        int i = 0;
        while (i != sizeOfStr) {
            anotherCh[i] = originalCh[i];
            i++;
        }
        String copiedString = new String(anotherCh);
        System.out.print(originalStr + " " + copiedString + " ");
    }
}
