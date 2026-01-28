package integerPrograms;


//program to find the duplicate elements in the array and print
public class FindDuplicatesElementsInArray {
    public static void main(String[] args) {

        int nums[] = {1, 3, 4, 5, 6, 4, 3, 2};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
