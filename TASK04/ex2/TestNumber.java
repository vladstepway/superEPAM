package by.stepovoy.task04.ex2;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        System.out.println("Enter natural number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int maxDigit = NaturalNumbersLogic.findBiggestDigit(number);
        System.out.println(maxDigit);
    }
}
