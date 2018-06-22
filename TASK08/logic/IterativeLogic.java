package by.stepovoy.task08.logic;

public class IterativeLogic {
    public static final int ERROR = -1;
    public static final int DEFAULT_SUM = 0;


    public static int calcSumOfDigitsIterative(int number) {
        boolean natural = isNatural(number);
        if (natural) {
            int sum = DEFAULT_SUM;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        } else return ERROR;
    }

    public static boolean isNatural(int number) {
        return number >= 0;
    }

    public static double powNumberIterative(double number, int pow) {
        boolean natural = isNatural(pow);
        if (natural) {
            if (pow == 0)
                return number;
            for (int i = 1; i <= pow; i++) {
                number *= i;
            }
            return number;
        } else return ERROR;
    }

    public static boolean isEqualsIterative(int number, int sum) {
        boolean positive1 = isNatural(number);
        boolean positive2 = isNatural(sum);
        int sumOfDigits = calcSumOfDigitsIterative(number);
        if (positive1 && positive2) {
            return sumOfDigits == sum;
        }
        return false;
    }

    public static int findFibonacciIterative(int index) {
        boolean natural = isNatural(index);
        int fib1 = 1, fib2 = 1, fib_sum ;

        if (natural) {
            for (int i = 0; i < index; i++) {
                fib_sum = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib_sum;
            }
        }
        return ERROR;
    }
    
}
