
public class StringLength {

    public static void main(String[] args) {
        String str = "I love java and Selenium";
        str = str.concat("\0");
        char[] strArray = str.toCharArray();
        int strLength =0;
        for(int i=0 ; i<strArray.length;i++){
            if(strArray[i]!='\0'){
                strLength++;
            }
        }
        System.out.println("Length of the string is: " + strLength);

        //using while loop
        int i=0;
        int count =0;
        while(strArray[i]!='\0'){
            count++;
            i++;
        }
        System.out.println("Length of the string is: " + count);
    }
}
