package by.stepovoy.task06;

import java.util.Random;

public class UtilitiesMultiArray {
    /**
     * method print multidimensional array in matrix view
     *
     * @param array multidimensional floating-point array
     */
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f \t", array[i][j]);

            }
            System.out.println();
        }
    }

    /**
     * method initializing multidimensional array
     *
     * @param array multidimensional floating-point array
     */
    public static void initArray(double[][] array, double min, double max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (min < max
                        ? random.nextDouble() * (max - min) + min
                        : random.nextDouble() * (min - max) + max);
            }
        }
    }
}
