package by.stepovoy.task05;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = in.nextInt();

        System.out.println("Enter minimal bound of range :");
        double minBound = in.nextDouble();
        System.out.println("Enter maximum bound of range :");
        double maxBound = in.nextDouble();

        double[] array = new double[size];
        OneDimArrayLogic.initArray(array, minBound, maxBound);
        if (!OneDimArrayLogic.isEmpty(array)) {
            System.out.println(Arrays.toString(array));

            double min = OneDimArrayLogic.findMin(array);
            double max = OneDimArrayLogic.findMax(array);

            System.out.println("min = " + min);
            System.out.println("max = " + max);

            System.out.println("array is sorted by ascending order :" + OneDimArrayLogic.isSortedAscend(array));
            System.out.println("array is sorted by descending order:" + OneDimArrayLogic.isSortedDescend(array));

            int indexMin = OneDimArrayLogic.findLocalMinIndex(array);
            int indexMax = OneDimArrayLogic.findLocalMaxIndex(array);
            System.out.printf("Index = %d of local min = %f\n", indexMin, array[indexMin]);
            System.out.printf("Index = %d of local max = %f\n", indexMax, array[indexMax]);

            double avgArithm = OneDimArrayLogic.findAvgArithmMean(array);
            double avgGeom = OneDimArrayLogic.findAvgGeoMean(array);

            System.out.println("Average arithmetic mean = " + avgArithm);
            System.out.println("Average geometric mean = " + avgGeom);

            OneDimArrayLogic.reverseArray(array);
            System.out.println("reversed array : " + Arrays.toString(array));
        } else System.out.println("Null array length");
    }
}
