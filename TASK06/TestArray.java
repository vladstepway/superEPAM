package by.stepovoy.task06;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter size of matrix :");

        int n = in.nextInt();
        int m = in.nextInt();

        double[][] array = new double[n][m];
        int[] minIndex;
        int[] maxIndex;

        System.out.println("Enter bounds of array values :");

        double leftBound = in.nextDouble();
        double rightBound = in.nextDouble();

        UtilitiesMultiArray.initArray(array, leftBound, rightBound);

        UtilitiesMultiArray.printArray(array);

        System.out.printf("min = %.2f\n", MultiDimArray.findMinValue(array));
        System.out.printf("max = %.2f\n", MultiDimArray.findMaxValue(array));

        minIndex = MultiDimArray.findLocalMinIndex(array);
        maxIndex = MultiDimArray.findLocalMaxIndex(array);

        System.out.println("Local min index is " + Arrays.toString(minIndex));
        System.out.println("Local max index is " + Arrays.toString(maxIndex));

        System.out.println("Average arithmetical mean is " + MultiDimArray.findAvgArithmMean(array));
        System.out.println("Average geometrical mean is " + MultiDimArray.findAvgGeomMean(array));

        System.out.println("Matrix before transposing : ");
        UtilitiesMultiArray.printArray(array);
        array = MultiDimArray.transpose(array);
        System.out.println("Matrix after transposing : ");
        UtilitiesMultiArray.printArray(array);


    }
}
