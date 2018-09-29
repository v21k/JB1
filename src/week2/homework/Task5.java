package week2.homework;

import week2.ArrayUtils;

import java.util.Scanner;

/*5. Порахувати, скільки разів зустрічається число
(число задає користувач) в масиві.*/
public class Task5 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 10);
        ArrayUtils.printArray(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
