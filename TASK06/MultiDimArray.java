package by.stepovoy.task06;

/**
 * Class perform different operations with MultiDimensional Arrays
 *
 * @author Stepovoy Vladislav
 * @version 1.8 09.06.2018
 */
public class MultiDimArray {

    public static final double ERROR_CODE = -9999999999999.0;
    public static final int ERROR_INDEX = -1;
    public static final int BOUND_OF_MULTI_ARRAY = 3;
    public static final double DEFAULT_SUM = 0.;
    public static final double DEFAULT_MULTIPLE = 1.;
    public static final int FIRST_ARRAY_INDEX = 0;
    public static final int SECOND_ARRAY_INDEX = 1;


    /**
     * method finds minimal value in array
     *
     * @param array multidimensional floating-point array
     * @return minimal value in array
     */

    public static double findMinValue(double[][] array) {
        double min = array[FIRST_ARRAY_INDEX][FIRST_ARRAY_INDEX];
        if (!isEmpty(array)) {
            for (double[] row : array) {
                for (double cow : row) {
                    if (min > cow) {
                        min = cow;
                    }
                }
            }
        } else {
            return ERROR_CODE;
        }
        return min;
    }

    /**
     * method finds maximal value in array
     *
     * @param array multidimensional floating-point array
     * @return maximal value in array
     */
    public static double findMaxValue(double[][] array) {
        double max = array[FIRST_ARRAY_INDEX][FIRST_ARRAY_INDEX];
        if (!isEmpty(array)) {
            for (double[] row : array) {
                for (double cow : row) {
                    if (max < cow) {
                        max = cow;
                    }
                }
            }
        } else {
            return ERROR_CODE;
        }
        return max;
    }

    /**
     * method finds average geometrical mean of array values
     *
     * @param array multidimensional floating-point array
     * @return average geometrical value
     */
    public static double findAvgGeomMean(double[][] array) {
        return !isEmpty(array) && isPositiveElements(array)
                ? Math.pow(findMultiple(array),
                1.0 / (array.length * array[FIRST_ARRAY_INDEX].length))
                : ERROR_CODE;
    }

    /**
     * method finds average arithmetical mean of array values
     *
     * @param array multidimensional floating-point array
     * @return average arithmetical value
     */
    public static double findAvgArithmMean(double[][] array) {
        return !isEmpty(array)
                ? findSum(array) / (array.length * array[FIRST_ARRAY_INDEX].length)
                : ERROR_CODE;
    }

    /**
     * method finds local minimum index in array
     *
     * @param array multidimensional floating-point array
     * @return index of local minimum value
     */
    public static int[] findLocalMinIndex(double[][] array) {
        int[] minIndex = {ERROR_INDEX, ERROR_INDEX};
        if (!isEmpty(array) && isMultiArray(array)) {
            for (int i = SECOND_ARRAY_INDEX; i < array.length - 1; i++) {
                for (int j = SECOND_ARRAY_INDEX; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i - 1][j - 1]
                            && array[i][j] < array[i - 1][j]
                            && array[i][j] < array[i - 1][j + 1]
                            && array[i][j] < array[i][j - 1]
                            && array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i + 1][j - 1]
                            && array[i][j] < array[i + 1][j]
                            && array[i][j] < array[i + 1][j + 1]) {
                        minIndex[FIRST_ARRAY_INDEX] = i;
                        minIndex[SECOND_ARRAY_INDEX] = j;
                        return minIndex;
                    }
                }
            }
        }
        return minIndex;
    }

    /**
     * method finds local maximum index in array
     *
     * @param array multidimensional floating-point array
     * @return index of local maximum value
     */
    public static int[] findLocalMaxIndex(double[][] array) {
        int[] maxIndex = {ERROR_INDEX, ERROR_INDEX};
        if (!isEmpty(array) && isMultiArray(array)) {
            for (int i = SECOND_ARRAY_INDEX; i < array.length - 1; i++) {
                for (int j = SECOND_ARRAY_INDEX; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i - 1][j - 1]
                            && array[i][j] > array[i - 1][j]
                            && array[i][j] > array[i - 1][j + 1]
                            && array[i][j] > array[i][j - 1]
                            && array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i + 1][j - 1]
                            && array[i][j] > array[i + 1][j]
                            && array[i][j] > array[i + 1][j + 1]) {
                        maxIndex[FIRST_ARRAY_INDEX] = i;
                        maxIndex[SECOND_ARRAY_INDEX] = j;
                        return maxIndex;
                    }
                }
            }
        }
        return maxIndex;
    }

    /**
     * method transposing matrix
     *
     * @param array multidimensional floating-point array
     * @return transposed matrix
     */
    public static double[][] transpose(double[][] array) {
        double[][] transMatrix = new double[array[FIRST_ARRAY_INDEX].length][array.length];
        for (int i = FIRST_ARRAY_INDEX; i < array.length; i++) {
            for (int j = FIRST_ARRAY_INDEX; j < array[i].length; j++) {
                transMatrix[j][i] = array[i][j];
            }
        }
        return transMatrix;
    }

    /**
     * method checks whether multidimensional array
     *
     * @param array multidimensional floating-point array
     * @return true if multi array,false if doesn't
     */
    public static boolean isMultiArray(double[][] array) {
        return array.length >= BOUND_OF_MULTI_ARRAY
                && array[FIRST_ARRAY_INDEX].length >= BOUND_OF_MULTI_ARRAY;
    }

    /**
     * method checks whether multidimensional array is empty
     *
     * @param array multidimensional floating-point array
     * @return true if multi array is empty,false if doesn't
     */
    public static boolean isEmpty(double[][] array) {
        return array.length <= 0 && array[FIRST_ARRAY_INDEX].length <= 0;
    }

    /**
     * method checks whether multidimensional array has positive elements
     *
     * @param array multidimensional floating-point array
     * @return true if multi array is positive,false if negative
     */
    public static boolean isPositiveElements(double[][] array) {
        for (double[] row : array) {
            for (double cow : row) {
                if (cow < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * method finds sum of an array values
     *
     * @param array multidimensional floating-point array
     * @return sum of an array values
     */
    public static double findSum(double[][] array) {
        double sum = DEFAULT_SUM;
        for (double[] row : array) {
            for (double cow : row) {
                sum += cow;
            }
        }
        return sum;
    }

    /**
     * method finds multiple of an array values
     *
     * @param array multidimensional floating-point array
     * @return multiple of an array values
     */
    public static double findMultiple(double[][] array) {
        double multiple = DEFAULT_MULTIPLE;
        for (double[] row : array) {
            for (double cow : row) {
                multiple *= cow;
            }
        }
        return multiple;
    }


}
