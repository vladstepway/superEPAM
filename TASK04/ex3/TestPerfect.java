package by.stepovoy.task04.ex3;

import java.util.Scanner;

public class TestPerfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.printf("Number %d is perfect : %b",number,PerfectNumberLogic.isPerfect(number));
    }
}
