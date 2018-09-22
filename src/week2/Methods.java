package week2;

public class Methods {
    public static void main(String[] args) {
        // input from user
        int a = 5;
        int b = 6;
        int area = calculateArea(a, b); // 5, 6

        int a2 = 15;
        int b2 = 25;
        int area2 = calculateArea(a2, b2);
        int area3 = calculateArea(a2 * 2, b2);
        int area4 = calculateArea(a2 / 2, b2);
        int area5 = calculateArea(a2, b2 + 5);

    }

    public static int calculateArea(int first, int second) {
        int area;

        if (first > second) {
            area = (first * second * second - 5 * 50 / first) * (first + second + first * second - first / second); //
        } else {
            area = (first * second * second - 5 * 50 / first) / (first + second + first * second - first / second);
        }

        return area;
    }
}
