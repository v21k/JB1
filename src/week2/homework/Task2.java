package week2.homework;

import week2.ArrayUtils;

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(5, 50);
        ArrayUtils.printArray(array);

        int max = array[0]; // 5
        int min = array[0]; // 1
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        array[maxIndex] = min;
        array[minIndex] = max;

        ArrayUtils.printArray(array);
    }
}
