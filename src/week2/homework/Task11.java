package week2.homework;

import week2.ArrayUtils;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] arr = ArrayUtils.generateArray(10, 15);
        ArrayUtils.printArray(arr);

        int[] splitted = ArrayUtils.splitArray(arr, start, end);
        ArrayUtils.printArray(splitted);
    }
}
