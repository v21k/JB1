package week1;

public class Conditions {
    public static void main(String[] args) {
        // these variables may not be hardcoded (e.g. read from user input)
        int first = 10;
        int second = 20;
        int result;

        if (first > second) { // false
            result = first + second;
        } else if (first == second) { // false
            result = first * second;
        } else if (first + second == 20) { // false
            result = 0;
        } else {
            result = first - second;
        }

        // logic operators
        // && - AND, || - OR

        if (first > second && first == 10) { // false - 1st statement is 'false', second is 'true'
            // ...
        }
        if (first > second || first == 10) { // true - 1st statement is 'false', second is 'true'
            // ...
        }
    }
}
