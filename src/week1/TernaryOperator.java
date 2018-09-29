package week1;

public class TernaryOperator {
    public static void main(String[] args) {
        int n = 5;

        if (n % 5 == 0){
            n = 6;
        } else {
            n = 20;
        }

        // ternary operator
        n = (n % 5 == 0) ? 6 : 20;
        n = (n % 5 == 0) ? 5
                : (n * 2) == 10 ? 5 : 4 ;
    }
}