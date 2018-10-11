package week3.classwork;

public class TwoDimArraysCycles {
    public static void main(String[] args) {
        int[][] outerArray = new int[5][2];

        for (int i = 0; i < outerArray.length; i++) {
            int[] innerArray = outerArray[i];

            for (int j = 0; j < innerArray.length; j++) {
                innerArray[j] = (int) (Math.random() * 50);
            }
        }

        MatrixUtils.printMatrix(outerArray);
        System.out.println("Hello!");
    }
}
