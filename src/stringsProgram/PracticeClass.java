package stringsProgram;

public class PracticeClass {

    public static void main(String[] args) {
        String str = "I love java";
        char[] x = str.toCharArray();
        int length = x.length;
        int i=0;
        int j=0;
        int count =0;
        while(i!=length){
            j=i;
            while(j<length){
                if(x[i] == x[j]) {
                    count++;
                }
                j++;
            }
            System.out.println("Total number of occurrance of "+x[i]+" is  : " + count);
            count =0 ;
            i++;
        }
    }
}
