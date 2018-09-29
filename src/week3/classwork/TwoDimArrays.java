package week3.classwork;

public class TwoDimArrays {
    public static void main(String[] args) {
        int[] oneDimArray = {5, 3, 4};
        int[][] twoDimArray = {
                {5, 3, 4},
                {5, 2, 1}
        };

        int[] oneDimArray2 = new int[5];
        int[][] twoDimArray2 = new int[5][2];
        twoDimArray2[0][1] = 5;

        int[] coordinates = {35, 11};
        twoDimArray2[1] = coordinates;

        int value = twoDimArray2[0][1]; // 5
        int[] coordinates2 = twoDimArray2[1]; // {35, 11}



    }
}
