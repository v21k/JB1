package week2.homework;

import java.util.Scanner;

/*Порахувати, скільки разів зустрічається цифра в 8 в заданому числі,
яке вводить користувач.
		5678 - 1
		6882 - 2*/
public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int counter = 0;
        while (number > 0) {
            counter = (number % 10 == 8) ? counter + 1 : counter;
            number = number / 10;
        }

        System.out.println(counter);
    }
}
