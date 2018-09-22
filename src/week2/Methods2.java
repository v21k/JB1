package week2;

public class Methods2 {
    public static void main(String[] args) {
        int[] salaries1 = {500, 500, 200, 1500, 1500};
        int[] salaries2 = {250, 500, 500, 100, 630, 200, 1500, 1500};
        double[] salaries3 = {250, 500, 500, 100, 630, 200, 1500, 1500};

/*        // bad programmer
        int sum1 = 0;
        for (int i = 0; i < salaries1.length; i++) {
            sum1 = sum1 + salaries1[i];
        }

        int sum2 = 0;
        for (int i = 0; i < salaries2.length; i++) {
            sum2 = sum2 + salaries2[i];
        }
        */
        // good programmer
        int sum3 = calculateTotalSalary(salaries1);
        int sum4 = calculateTotalSalary(salaries2);
    }

    // salaries2 --- input argument
    // array --- salaries2
    public static int calculateTotalSalary(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}
