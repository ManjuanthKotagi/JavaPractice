package integerPrograms;

//program to reverse the array elements
public class ReverseTheArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        int size = array.length;
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed string is : " );
        for(int i=0;i<size;i++) {
            System.out.println(array[i]);
        }
    }
}
