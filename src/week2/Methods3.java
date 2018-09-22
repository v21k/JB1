package week2;

public class Methods3 {
    public static void main(String[] args) {
        int[] salaries = {500, 200, 300, 500};

        myMethod(salaries);
    }

    public static void myMethod(int[] sal) {
        for (int i = 0; i < sal.length; i++) {
            System.out.println("Worker #" + (i + 1) + " -> " + sal[i]);
        }
    }
}
