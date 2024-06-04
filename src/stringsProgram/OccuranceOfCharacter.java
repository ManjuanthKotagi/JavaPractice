package stringsProgram;

public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String str = "Welcome to Wipro";
        char[] x = str.toCharArray();
        int size = x.length;
        int i=0;
        int j=0;
        int count =0;
        while(i!=size){
            j=i;
            while(j<size){
                if(x[i]==x[j]){
                    count++;
                }
                j++;
            }
            System.out.println("Count of the "+ x[i] + " is : " + count);
            count = 0;
            i++;
        }
    }
}
