package week2.homework;

import week2.ArrayUtils;

public class Task9 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.generateArray(10, 50);
        int[] arr2 = ArrayUtils.generateArray(10, 50);
        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }

        ArrayUtils.printArray(arr3);
    }
}
