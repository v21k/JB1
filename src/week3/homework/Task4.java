package week3.homework;

import week2.ArrayUtils;
import week3.classwork.MatrixUtils;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateMatrix(5, 5, 150);
        MatrixUtils.printMatrix(matrix);
        int[] diagonal = new int[5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                    break;
                }
            }
        }

        System.out.println("Diagonal:");
        ArrayUtils.printArray(diagonal);
    }
}
