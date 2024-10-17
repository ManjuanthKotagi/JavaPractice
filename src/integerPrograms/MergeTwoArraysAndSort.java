package integerPrograms;

import java.util.Arrays;

public class MergeTwoArraysAndSort {

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 1};
        int b[] = {1, 5, 6, 8};

        int c[] = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
