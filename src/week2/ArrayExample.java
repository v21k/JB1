package week2;

public class ArrayExample {
    public static void main(String[] args) {

        // init

        int variable = 5;
        int var; // 0
        int[] intArray = new int[5];
        // [0, 0, 0, 0, 0]
        int[] ipAddress = {155, 255, 10, 15}; // size == 4
        int[] ipAddress2 = new int[]{13, 25}; // size == 2

        ipAddress = new int[10]; // ten zeros, size == 10
        ipAddress = new int[]{155, 255, 10, 15}; // size == 4

        // get element

        int[] intArray2 = {5, 6, 3};
        int firstElement = intArray2[0]; // 1st element -> 5
        int secondElement = intArray2[1]; // 1st element -> 5
        int thirdElement = intArray2[2]; // 1st element -> 5

        // write to array

        int[] intArray3 = new int[5];
        // 1st index ---> 3
        intArray3[4] = 6;
        intArray3[0] = 2;
        // rewrite cell
        intArray3[4] = 3;

        // multi-line init
        int[] intArray4 = {
                100, 500, 300,
                500, 400, 500
        };

        int intArray4Length = intArray4.length;

        // for loop
        int sum = 0;
        for (int start = 0; start < intArray4.length; start++) {
            int element = intArray4[start];
            if (element == 20) {
                continue;
            }
            sum = sum + element;
        }

        // while loop
        int sum2 = 0;
        int start = 0;
        while (start < intArray4.length) {
            sum2 = sum2 + intArray4[start];
            start++;
        }

        // for each
        int sum3 = 0;
        for (int element : intArray4) {
            sum3 = sum3 + element;
        }
    }
}
