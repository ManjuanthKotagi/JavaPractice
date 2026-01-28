package integerPrograms;

// Write a java program to push zeros at the end of the given array {8,0,8,7,6,0,4,0,3}
public class PushAllTheZerosAtTheEnd {

    public static void main(String[] args) {
        Integer[] numbers = {8, 0, 8, 7, 6, 0, 4, 0, 3};
        int length = numbers.length;
        int index = 0;

        //place all non zero elements at the begining
        for (int i = 0; i < length; i++) {
            if (numbers[i] != 0) {
                numbers[index++] = numbers[i];
            }
        }

        //place remaining position as zero
        for (int i = index; i < length; i++) {
            numbers[index++] = 0;
        }

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
