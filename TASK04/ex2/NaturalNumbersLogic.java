package by.stepovoy.task04.ex2;

public class NaturalNumbersLogic {
    public static int isNatural(int num) {
        return num < 0 ? -num : num;
    }

    public static int findBiggestDigit(int num) {
        num = isNatural(num);
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

    public static boolean isPalindromeNumber(int num) {
        num = isNatural(num);
        int tempNumber = num;
        int reversibleNumber = 0;

        while (tempNumber > 0) {
            reversibleNumber *= 10;
            reversibleNumber += tempNumber % 10;
            tempNumber /= 10;
        }
        return reversibleNumber == num;
    }

    public static boolean isSimpleNumber(int num) {
        num = isNatural(num);

        for (int i = 2; i <= num >>> 1; i++) {
            if (isDivider(num, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDivider(int num, int i) {
        return num % i == 0;
    }

    public static StringBuffer findSimpleDivisors(int num) {
        num = isNatural(num);
        StringBuffer dividers = new StringBuffer();
        for (int i = 1; i <= num >>> 1; i++) {
            if (isDivider(num, i)) {
                if (isSimpleNumber(i)) {
                    dividers.append(i).append(" ");
                }
            }
        }
        if (isSimpleNumber(num)) {
            dividers.append(num).append(" ");
        }

        return dividers;
    }

    public static int findGreatestCommonDivisor(int number1, int number2) {
        number1 = isNatural(number1);
        number2 = isNatural(number2);

        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        return number1;
    }

    public static int findLeastCommonMultiple(int number1, int number2) {
        number1 = isNatural(number1);
        number2 = isNatural(number2);

        return number1 / findGreatestCommonDivisor(number1, number2) * number2;
    }

    public static int findDifferentDigitsNumber(int num) {
        num = isNatural(num);

        int tempNumber;
        int digits;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            digits = num;
            while (digits > 0) {
                tempNumber = digits % 10;
                if (tempNumber == i) {
                    count++;
                    break;
                }
                digits /= 10;
            }
        }
        return count;
    }
}

