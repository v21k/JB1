package week2;

public class ClassWork {
    public static void main(String[] args) {
        int[] salaries = {555, 554, 723, 665, 785, 400};

        // method - calculate sum only for elements where
        // element % 5 == 0

    }

    public static int calculateSalaries(int[] array) {

        int sum = 0;

        for (int index = 0; index < array.length; index++) {
            int currentElement = array[index];

            if (currentElement % 5 == 0) {
                sum = sum + currentElement;
            }
        }

        return sum;

        // sum = 0;
        // for cycle
        // if (element % 5 == 0) -->
        // else -->
        // return sum
    }
}
