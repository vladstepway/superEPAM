package by.stepovoy.ex5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double ar = AverageOfDigitsLogic.averageArithmetic(N);
        double geom = AverageOfDigitsLogic.averageGeometric(N);
        System.out.printf("AverageArithmetic = %f\n",ar);
        System.out.printf("AverageGeometric = %f\n",geom);

    }
}
