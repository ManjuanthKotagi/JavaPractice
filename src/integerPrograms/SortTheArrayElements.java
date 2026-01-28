package integerPrograms;

public class SortTheArrayElements {
    public static void main(String[] args) {
        int array[] = {8, 5, 1, 3, 4, 6, 7, 2};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        System.out.println("smallest number is : " + array[0]);
        System.out.println("highest number is : " + array[size-1]);
        System.out.println("highest number is : " + array[size-2]);
    }
}
