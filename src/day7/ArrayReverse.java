package day7;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(myArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}

