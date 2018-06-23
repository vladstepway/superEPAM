package by.stepovoy.task08;

import by.stepovoy.task08.exception.NotNaturalNumberException;
import by.stepovoy.task08.logic.RecursiveLogic;
import by.stepovoy.task08.view.Printer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Printer.print("Enter number :");
        int number = in.nextInt();
        try {
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

            number = 1;
            char first = 'A';
            char temp = 'B';
            char second = 'C';

            RecursiveLogic.solveHanoiTower(number, first, temp, second);
        } catch (NotNaturalNumberException e) {
            System.out.println(e.getMessage() + " " + e.getNumber());
        }
    }
}
