package week2;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // separate
        int a = 6;
        int b = 6;

        int[] array1 = {56, 75, 52};
        int[] array2 = array1;

        array1[0] = 5;
    }
}
