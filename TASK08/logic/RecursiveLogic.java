package by.stepovoy.task08.logic;

import by.stepovoy.task08.exception.NotNaturalNumberException;

public class RecursiveLogic {
    public static final int ERROR = -1;


    public static int calcSumOfDigitsRecursive(int number) throws NotNaturalNumberException {
        isNatural(number);
        if (number < 10)
            return number;
        return number % 10
                + calcSumOfDigitsRecursive(number / 10);
    }

    public static void isNatural(int number) throws NotNaturalNumberException {
        if (number <= 0) {
            throw new NotNaturalNumberException("This number is not natural ", number);
        }
    }

    public static double powNumber(double number, int pow) throws NotNaturalNumberException {
        isNatural(pow);
        if (pow == 0) {
            return 1;
        }
        if (number == 0) {
            return number;
        }
        return number * powNumber(number, pow - 1);
    }

    public static boolean isEquals(int number, int sum) throws NotNaturalNumberException {
        isNatural(number);
        isNatural(sum);
        if (number == 0) {
            if (sum == 0) {
                return true;
            }
            return false;
        }
        return isEquals(number / 10,
                sum - (number % 10));
    }

    public static int findFibonacci(int index) throws NotNaturalNumberException {
        isNatural(index);
        if (index < 2) {
            return index;
        }
        return findFibonacci(index - 1)
                + findFibonacci(index - 2);
    }

    public static void solveHanoiTower(int numOfRings,
                                       char first, char temp, char second) throws NotNaturalNumberException {
        isNatural(numOfRings);
        solveHanoiTower(numOfRings - 1, first, second, temp);
        System.out.println(first + " to " + second);
        solveHanoiTower(numOfRings - 1, temp, first, second);

    }


}
