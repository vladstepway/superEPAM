package by.stepovoy.task04.ex2;

import java.util.Scanner;

import static by.stepovoy.task04.ex2.NaturalNumbersLogic.findLeastCommonMultiple;

public class TestNumber {
    public static void main(String[] args) {
        System.out.println("Enter natural number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int num2 = in.nextInt();

        int maxDigit = NaturalNumbersLogic.findBiggestDigit(number);
        System.out.println(maxDigit);

        System.out.printf("Number %d isPalindrome : %b\n", number, NaturalNumbersLogic.isPalindromeNumber(number));

        System.out.printf("Number %d isSimple : %b\n", number, NaturalNumbersLogic.isSimpleNumber(number));

        StringBuffer stringBuffer;
        stringBuffer = NaturalNumbersLogic.findSimpleDivisors(number);
        System.out.println("Dividers of number " + number + ":" + stringBuffer);

        System.out.println("GCD of " + number + " and " + num2 + " is " + NaturalNumbersLogic.findGreatestCommonDivisor(number, num2));
        System.out.println("LCM of " + number + " and " + num2 + " is " + findLeastCommonMultiple(number, num2));

        System.out.printf("Number %d has %d different digits", number, NaturalNumbersLogic.findDifferentDigitsNumber(number));

    }
}
