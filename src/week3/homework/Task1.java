package week3.homework;

import week3.classwork.MatrixUtils;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = MatrixUtils.generateMatrix(rows, columns, 100);
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int[] innerArray = matrix[i];

            for (int j = 0; j < innerArray.length; j++) {
                int currentElement = innerArray[j];

                if (currentElement % 5 == 0) {
                    innerArray[j] = 8;
                }
            }
        }

        System.out.println("Loading...");
        MatrixUtils.printMatrix(matrix);
    }
}
