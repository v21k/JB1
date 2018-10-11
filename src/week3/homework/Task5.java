package week3.homework;

import week3.classwork.MatrixUtils;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrix(5, 8, 10);
        MatrixUtils.printMatrix(matrix);

        int maxColumnSum = 0;
        int minColumnSum = Integer.MAX_VALUE;
        int maxColumnIndex = 0;
        int minColumnIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }

            if (sum > maxColumnSum) {
                maxColumnSum = sum;
                maxColumnIndex = i;
            }
            if (sum < minColumnSum) {
                minColumnSum = sum;
                minColumnIndex = i;
            }
        }
    }

    private static void swapRows(int[][] matrix) {
        int maxRowSum = 0;
        int minRowSum = Integer.MAX_VALUE;
        int maxRowIndex = 0;
        int minRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxRowSum) {
                maxRowSum = sum;
                maxRowIndex = i;
            }
            if (sum < minRowSum) {
                minRowSum = sum;
                minRowIndex = i;
            }
        }

        int[] tempRow = matrix[minRowIndex];
        matrix[minRowIndex] = matrix[maxRowIndex];
        matrix[maxRowIndex] = tempRow;

        System.out.println("After swap:");
        MatrixUtils.printMatrix(matrix);
    }
}
