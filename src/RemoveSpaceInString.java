public class RemoveSpaceInString {

    public static void main(String[] args) {

        String x = "I Love Java";
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;
        int j=0;
        int spaceCount=0;


        //count the spaces
        while(i!=size){
            if(y[i]==' '){
                spaceCount++;
            }
            i++;
        }

        //initializing i again 0 and creating new char array with size-spaceCount to avoid junk values at the end;
        i=0;
        char z[] = new char[size-spaceCount];
        while (i != size) {
            if(y[i]!= ' '){
                z[j]=y[i];
                j++;
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
