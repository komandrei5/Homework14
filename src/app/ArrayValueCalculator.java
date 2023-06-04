package app;

import java.util.Arrays;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || Arrays.stream(array).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Invalid array size");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at index [" + i + "][" + j + "][", e);
                }
            }
        }
        return sum;
    }
}
