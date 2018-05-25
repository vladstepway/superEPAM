package by.stepovoy.ex3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R1,R2,square;
        R1 = in.nextDouble();
        R2 = in.nextDouble();
        square = CircleSquareLogic.circleSquare(R1,R2);
        System.out.printf("R1 = %f\n",R1);
        System.out.printf("R2 = %f\n",R2);
        System.out.printf("Circle square = %f\n",square);
    }
}
