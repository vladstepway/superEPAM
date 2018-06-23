package by.stepovoy.task08.logic;

import by.stepovoy.task08.exception.NotNaturalNumberException;

public class IterativeLogic {
    public static final int DEFAULT_SUM = 0;


    public static int calcSumOfDigitsIterative(int number)
            throws NotNaturalNumberException {
        isNatural(number);
        int sum = DEFAULT_SUM;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void isNatural(int number)
            throws NotNaturalNumberException {
        if (number <= 0) {
            throw new NotNaturalNumberException
                    ("This number is not natural ", number);
        }
    }

    public static double powNumberIterative(double number, int pow)
            throws NotNaturalNumberException {
        isNatural(pow);
        if (pow == 0) {
            return number;
        }

        for (int i = 1; i <= pow; i++) {
            number *= i;
        }
        return number;
    }

    public static boolean isEqualsIterative(int number, int sum)
            throws NotNaturalNumberException {
        isNatural(number);
        isNatural(sum);
        int sumOfDigits = calcSumOfDigitsIterative(number);
        return sumOfDigits == sum;

    }

    public static int findFibonacciIterative(int index) throws NotNaturalNumberException {
        isNatural(index);
        int fib1 = 1, fib2 = 1, fib_sum = 0;
        for (int i = 0; i < index; i++) {
            fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
        }
        return fib_sum;

    }

}
