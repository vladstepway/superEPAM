package by.stepovoy.task04.ex2;

public class NaturalNumbersLogic {

    public static int findBiggestDigit(int num) {

        int biggest = num % 10;
        int number;
        while (num > 0) {
            number = num % 10;
            num /= 10;
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }

    public static boolean isPalindromNumber(int num) {

        int firstDigit = num % 10;
        int lastDigit;
    }
}

