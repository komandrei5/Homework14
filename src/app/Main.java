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

        try {
            int result1 = calculator.doCalc(array1);
            System.out.println("Result: " + result1);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result2 = calculator.doCalc(array2);
            System.out.println("Result: " + result2);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }

    }
}
