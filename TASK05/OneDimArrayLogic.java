package by.stepovoy.task05;

import java.util.Random;

/**
 * This class calculate different operations with one dimensional array
 *
 * @author Stepovoy Vladislav
 * @version 1.8 06.06.2018
 */
public class OneDimArrayLogic {

    public static final int FIRST_ARRAY_INDEX = 0;
    public static final int SECOND_ARRAY_INDEX = 1;
    public static final int ERROR_MESSAGE = -1;

    /**
     * this method finding minimal element of array
     *
     * @param array array of floating point elements
     * @return minimal element of array
     */
    public static double findMin(double[] array) {

        double min = array[FIRST_ARRAY_INDEX];
        for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * this method finding maximal element of array
     *
     * @param array array of floating point elements
     * @return maximal element of array
     */

    public static double findMax(double[] array) {
        double max = array[FIRST_ARRAY_INDEX];
        for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * this method finding average arithmetical mean of array's elements
     *
     * @param array array of floating point elements
     * @return average mean
     */
    public static double findAvgArithmMean(double[] array) {

        double sum = 0.;
        for (double arrayElement : array) {
            sum += arrayElement;
        }
        return sum / array.length;
    }

    /**
     * this method finding average geometrical mean of array's elements
     *
     * @param array array of floating point elements
     * @return average mean
     */
    public static double findAvgGeoMean(double[] array) {

        if (isPositiveElements(array)) {
            double multiple = 1.;
            for (double arrayElement : array) {
                multiple *= arrayElement;
            }
            return Math.pow(multiple, 1. / array.length);
        } else
            return ERROR_MESSAGE;
    }

    /**
     * this method  checking whether array is sorted by descending order
     *
     * @param array array of floating point elements
     * @return true if array is sorted, false if is not sorted
     */
    public static boolean isSortedDescend(double[] array) {
        if (!isEmpty(array)) {
            for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
                if (array[i] > array[i - SECOND_ARRAY_INDEX]) {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }
    /**
     * this method  checking whether array is sorted by ascending order
     *
     * @param array array of floating point elements
     * @return true if array is sorted, false if is not sorted
     */
    public static boolean isSortedAscend(double[] array) {
        if (!isEmpty(array)) {
            for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
                if (array[i] < array[i - SECOND_ARRAY_INDEX]) {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }

    /**
     * this method  reversing array
     *
     * @param array array of floating point elements
     */
    public static void reverseArray(double[] array) {
        for (int i = FIRST_ARRAY_INDEX; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - i - SECOND_ARRAY_INDEX];
            array[array.length - i - SECOND_ARRAY_INDEX] = array[i] - array[array.length
                    - i - SECOND_ARRAY_INDEX];
            array[i] = array[i] - array[array.length - i - SECOND_ARRAY_INDEX];
        }
    }
    /**
     * this method  checking whether all elements are positive
     *
     * @param array array of floating point elements
     * @return true if each one element positive, false if at least one is negative
     */
    public static boolean isPositiveElements(double[] array) {
        for (double arrayElement : array) {
            if (arrayElement < 0.) {
                return false;
            }
        }
        return true;
    }
    /**
     * this method  finding first case of local minimum
     *
     * @param array array of floating point elements
     * @return position of local minimum,else error message
     */
    public static int findLocalMinIndex(double[] array) {

        for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
            if (array[i] < array[i - SECOND_ARRAY_INDEX]
                    && array[i] < array[i + SECOND_ARRAY_INDEX]) {
                return i;
            }
        }
        return ERROR_MESSAGE;
    }
    /**
     * this method  finding first case of local maximum
     *
     * @param array array of floating point elements
     * @return position of local maximum,else error message
     */
    public static int findLocalMaxIndex(double[] array) {

        for (int i = SECOND_ARRAY_INDEX; i < array.length; i++) {
            if (array[i] > array[i - SECOND_ARRAY_INDEX]
                    && array[i] > array[i + SECOND_ARRAY_INDEX]) {
                return i;
            }
        }
        return ERROR_MESSAGE;
    }

    /**
     * this method initializing array with floating point elements
     * @param array array of floating point elements
     * @param left left boarder for random value
     * @param right right boarder for random value
     */

    public static void initArray(double[] array, double left, double right) {
        Random random = new Random();
        for (int i = FIRST_ARRAY_INDEX; i < array.length; i++) {
            if (right > left) {
                array[i] = random.nextDouble() * (right - left) + left;

            } else if (left == right) {
                array[i] = ERROR_MESSAGE;
            } else {
                array[i] = random.nextDouble() * (left - right) + right;
            }
        }
    }

    /**
     * this method checking whether array is empty of has negative number
     * @param array array of floating-point elements
     * @return true if array's length is zero or less,false if doesn't empty
     */
    public static boolean isEmpty(double[] array) {
        return array.length <= 0;
    }

}
