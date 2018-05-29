package by.stepovoy.task03.ex2;

import java.util.Scanner;

public class TestNumberHeads {
    public static void main(String[] args) {

        System.out.println("Enter how old your dragon :");
        Scanner in = new Scanner(System.in);

        int years = in.nextInt();

        if (years < 0) {
            System.out.println("Could not to be years less than zero");
        } else {

            int heads = DragonHeadsLogic.countHeads(years);

            int eyes = DragonHeadsLogic.countEyes(heads);

            System.out.printf("Your dragon has %d heads and %d eyes", heads, eyes);
        }
    }
}
