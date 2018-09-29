package week2.homework;

import week2.ArrayUtils;

import java.util.Scanner;

/*Інвертувати масив (розвернути) без використання додаткового масиву.*/
public class AdditionalTask2 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.generateArray(6, 100);
        ArrayUtils.printArray(arr1);

        for (int i = 0; i < arr1.length / 2; i++) {
            int element = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = element;
        }

        ArrayUtils.printArray(arr1);
    }
}
