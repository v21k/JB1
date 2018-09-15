package week1;

public class BasicOperations {
    public static void main(String[] args) {
        // initialize primitive type variables
        boolean myBoolean = true; // false
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 2000000000;
        long myLong = 42345345435453453L;
        float myFloat = 2.3f;
        double myDouble = 2.6342423;

        // operators
        int result = 10 % 6; // 4
        double division = 3.0 / 2.0; // 1.5

        int negativeValue = -5;
        int positiveValue = -negativeValue; // 5
        int negativeValue2 = -positiveValue; // -5

        // increments, same for '--'
        int leftIncr = 10;
        int leftIncrNew = ++leftIncr; // same as 'leftIncr + 1';
        int rightIncr = 10;
        int rightIncrNew = rightIncr++; // rightIncrNew = 10 after this, rightIncr = 11

        boolean testBoolean = true;
        boolean testBoolean2 = !testBoolean; // false
    }
}
