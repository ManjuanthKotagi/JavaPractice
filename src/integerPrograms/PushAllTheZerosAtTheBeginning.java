package integerPrograms;

public class PushAllTheZerosAtTheBeginning {

    public static void main(String[] args) {
        Integer[] numbers = {9, 0, 8, 0, 3, 6, 0, 7, 4, 0};
        int length = numbers.length;
        int countOfZero = 0;
        Integer[] sortedList = new Integer[length];

        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                countOfZero = countOfZero + 1;
            }
        }

        for (int i = 0; i < countOfZero; i++) {
            sortedList[i] = 0;
        }

        for (int i = 0; i < length; i++) {
            if (numbers[i] != 0) {
                sortedList[countOfZero++] = numbers[i];
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(sortedList[i]);
        }
    }
}
