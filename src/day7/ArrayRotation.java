package day7;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;
        int[] rotatedArray = rotateArrayLeft(arr, x);
        System.out.println(Arrays.toString(rotatedArray));
    }

    public static int[] rotateArrayLeft(int[] arr, int x) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - x) % n;
            rotatedArray[newIndex] = arr[i];
        }

        return rotatedArray;
    }
}
