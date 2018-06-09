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

    /**
     * method finds minimal value in array
     *
     * @param array multidimensional floating-point array
     * @return minimal value in array
     */

    public static double findMinValue(double[][] array) {
        double min = array[0][0];
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
        double max = array[0][0];
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
        double multiple = 1.;
        if (!isEmpty(array) && isPositiveElements(array)) {
            for (double[] row : array) {
                for (double cow : row) {
                    multiple *= cow;
                }
            }
            return Math.pow(multiple, 1.0 / (array.length * array[0].length));
        } else
            return ERROR_CODE;
    }

    /**
     * method finds average arithmetical mean of array values
     *
     * @param array multidimensional floating-point array
     * @return average arithmetical value
     */
    public static double findAvgArithmMean(double[][] array) {
        double sum = 0.;
        if (!isEmpty(array)) {
            for (double[] row : array) {
                for (double cow : row) {
                    sum += cow;
                }
            }
            return sum / (array.length * array[0].length);
        } else
            return ERROR_CODE;
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
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i - 1][j - 1]
                            && array[i][j] < array[i - 1][j]
                            && array[i][j] < array[i - 1][j + 1]
                            && array[i][j] < array[i][j - 1]
                            && array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i + 1][j - 1]
                            && array[i][j] < array[i + 1][j]
                            && array[i][j] < array[i + 1][j + 1]) {
                        minIndex[0] = i;
                        minIndex[1] = j;
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
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i - 1][j - 1]
                            && array[i][j] > array[i - 1][j]
                            && array[i][j] > array[i - 1][j + 1]
                            && array[i][j] > array[i][j - 1]
                            && array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i + 1][j - 1]
                            && array[i][j] > array[i + 1][j]
                            && array[i][j] > array[i + 1][j + 1]) {
                        maxIndex[0] = i;
                        maxIndex[1] = j;
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
        double[][] transMatrix = new double[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
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
                && array[0].length >= BOUND_OF_MULTI_ARRAY;
    }

    /**
     * method checks whether multidimensional array is empty
     *
     * @param array multidimensional floating-point array
     * @return true if multi array is empty,false if doesn't
     */
    public static boolean isEmpty(double[][] array) {
        return array.length <= 0 && array[0].length <= 0;
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

}
