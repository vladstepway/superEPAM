package by.stepovoy.task08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Printer.print("Enter number :");
        int number = in.nextInt();
        Printer.print(RecursiveLogic.calcSumOfDigitsRecursive(number));
        Printer.print("Enter number :");
        number = in.nextInt();
        Printer.print("Enter power :");
        int power = in.nextInt();
        Printer.print(RecursiveLogic.powNumber(number, power));
        Printer.print("Enter number :");
        number = in.nextInt();
        Printer.print("Enter sum :");
        int sum = in.nextInt();
        Printer.print(RecursiveLogic.isEquals(number, sum));
        Printer.print("Enter index of fibonacci number :");
        number = in.nextInt();
        Printer.print(RecursiveLogic.findFibonacci(number));
    }
}