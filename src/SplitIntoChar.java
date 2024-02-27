public class SplitIntoChar {

    public static void main(String[] args) {
        String str = "I love java and Selenium";
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();
        for(char chs : ch){
           System.out.println(chs);
        }
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
