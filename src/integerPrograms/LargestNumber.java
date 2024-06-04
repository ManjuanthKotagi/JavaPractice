package integerPrograms;

public class LargestNumber {

    //Finding the largest number from the array
    public static void main(String[] args) {
        int array[] = {10,25,5,15,35};
        int largestNumber = array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>largestNumber){
                largestNumber = array[i];
            }
        }
        System.out.println("Largest Number is : " + largestNumber);
    }
}
