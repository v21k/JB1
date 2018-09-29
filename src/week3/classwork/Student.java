package week3.classwork;

public class Student {
    // fields - state
    int age;
    String name;
    int course;
    double[] rates;

    // methods - behaviour
    void sayName() {
        System.out.println(name);
    }

    double getAvgRate() {
        double sum = 0.0;
        for (int i = 0; i < rates.length; i++) {
            // sum = sum + rates[i];
            sum += rates[i];
        }

        return sum / rates.length;
    }

}
