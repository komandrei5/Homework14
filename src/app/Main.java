package app;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int result1 = calculator.doCalc(array1);
        System.out.println("Result: " + result1);

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int result2 = calculator.doCalc(array2);
        System.out.println("Result: " + result2);
    }
}
