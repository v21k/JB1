package week2.homework;

import week2.ArrayUtils;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateArray(10, 100);
        ArrayUtils.printArray(arr);

        int sumLeft = 0;
        int sumRight = 0;
        int arrayLengthHalf = arr.length / 2;

        for (int i = 0; i < arrayLengthHalf; i++) {
            sumLeft += arr[i];
            sumRight += arr[arr.length - i - 1];
        }

        int avgLeft = sumLeft / arrayLengthHalf;
        int avgRight = sumRight / arrayLengthHalf;

        System.out.println(avgLeft > avgRight ? "Left" : "Right");
    }
}
