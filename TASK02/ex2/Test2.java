package by.stepovoy.ex2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kg = in.nextDouble();
        double ton = ConvertingLogic.convertToTones(kg);
        double gram = ConvertingLogic.convertToGrams(kg);
        double mg = ConvertingLogic.convertToMilligrams(kg);

        System.out.printf("%5.3f kg\n", kg);
        System.out.printf("%5.3f t\n", ton);
        System.out.printf("%f g\n", gram);
        System.out.printf("%f mg\n", mg);
    }
}
