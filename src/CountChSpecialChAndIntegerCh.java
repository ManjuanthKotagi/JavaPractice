public class CountChSpecialChAndIntegerCh {

    public static void main(String args[]){
        String str = "12Yut6Gfs $th^7";
        char[] x = str.toCharArray();
        int size = x.length;
        int i=0;
        int charCount=0;
        int specialChar=0;
        int integerCount=0;
        while(i<size){
            if(x[i]>='A' && x[i]<='Z' || x[i]>='a' && x[i]<='z'){
                charCount++;
                i++;
            }
            else if(x[i]>='1' && x[i]<='9'){
                integerCount++;
                i++;
            }
            else{
                specialChar++;
                i++;
            }
        }
        System.out.println("Char count is " + charCount);
        System.out.println("Special Char count is " + specialChar);
        System.out.println("Integer count is " + integerCount);
    }
}
