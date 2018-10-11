package week2;

public class ArrayUtils {

    public static int[] generateArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random(); // 0.3, 0.254534, 0.911343, 0.03
            int element = (int) (limit * random);
            resultArray[i] = element;
        }

        return resultArray;
    }

    public static int[] generateArrayEvenIndices(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random(); // 0.3, 0.254534, 0.911343, 0.03
            int element = (int) (limit * random);

            if (i % 2 == 0) {
                resultArray[i] = element % 2 == 0 ? element : element + 1;
            } else {
                resultArray[i] = element % 2 != 0 ? element : element + 1;
            }

        }
        return resultArray;
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        // обрезать массив по границам start и end
        int[] result = new int[end - start];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[start + i];
            System.out.println("i: " + i + ", start + i: " + (start + i));
        }
        return result;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
    }
}
