package integerPrograms;
//program to merge two integer array into one array

public class MergeTwoIntegerArray {

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4};
        int array2[] = {5, 6, 7, 8};

        int array1Size = array1.length;
        int array2Size = array2.length;

        int mergeArray[] = new int[array1Size + array2Size];

        for (int i = 0; i < array1Size; i++) {
            mergeArray[i] = array1[i];
        }

        for (int j =0;j<array2Size;j++) {
            mergeArray[array1Size + j] = array2[j];
        }

        for(int i=0;i<mergeArray.length;i++) {
            System.out.println(mergeArray[i]);
        }
        System.out.println("Merge array size is " + mergeArray.length);
    }
}
