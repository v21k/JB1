package week3.classwork;

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 20;
        student1.name = "Ivan";
        student1.course = 4;
        student1.rates = new double[]{1.0, 4.1, 2.6, 1.2, 4.1};

        Student student2 = null;
        student2 = new Student();
        student2.age = 18;
        student2.name = "Denis";
        student2.course = 2;
        student2.rates = new double[]{3.0, 5.0, 4.6, 3.2, 4.1};

        int[] intArray = new int[5];
        int[] intStudent = new int[5];
        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        // methods
        student1.sayName();
        student2.sayName();

        // cycle
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.sayName();

            double avgRate = student.getAvgRate();
            if (avgRate >= 3.0) {
                System.out.println("You're good boy! Your avg rate " + avgRate);
            } else {
                System.out.println("Loser! Bye-bye. Your avg rate " + avgRate);
            }
        }
    }
}
