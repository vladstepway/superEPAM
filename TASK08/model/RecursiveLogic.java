package by.stepovoy.task08.model;

public class RecursiveLogic {
    public static final int ERROR = -1;


    public static int calcSumOfDigitsRecursive(int number) {
        boolean natural = isNatural(number);
        if (natural) {
            if (number < 10)
                return number;
            return number % 10
                    + calcSumOfDigitsRecursive(number / 10);
        } else
            return ERROR;
    }

    public static boolean isNatural(int number) {
        return number >=  0;
    }

    public static double powNumber(double number, int pow) {
        boolean natural = isNatural(pow);
        if (natural) {
            if (pow == 0) {
                return 1;
            }
            return number * powNumber(number, pow - 1);
        } else return ERROR;
    }

    public static boolean isEquals(int number, int sum) {
        boolean positive1 = isNatural(number);
        boolean positive2 = isNatural(sum);
        if (positive1 && positive2) {
            if (number == 0) {
                if (sum == 0) {
                    return true;
                }
                return false;
            }
            return isEquals(number / 10,
                    sum - (number % 10));
        }
        return false;
    }

    public static int findFibonacci(int index) {
        boolean natural = isNatural(index);
        if (natural) {
            if (index < 2) {
                return index;
            }
            return findFibonacci(index - 1)
                    + findFibonacci(index - 2);
        }
        return ERROR;
    }

    public static void solveHanoiTower(int numOfRings,
                                       char first, char temp, char second) {
        boolean natural = isNatural(numOfRings);
        if (natural) {
            solveHanoiTower(numOfRings-1, first, second, temp);
            System.out.println(first + " to " + second);
            solveHanoiTower(numOfRings-1,temp,first,second);
        }
    }


}
