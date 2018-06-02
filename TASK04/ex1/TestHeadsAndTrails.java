package by.stepovoy.task04.ex1;

import java.util.Scanner;

public class TestHeadsAndTrails {
    public static void main(String[] args) {
        System.out.println("Enter ,how many times to toss a coin :");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int heads = HeadsAndTrailsLogic.tossCoin(count);
        int trails = HeadsAndTrailsLogic.countTrails(count,heads);

        System.out.printf("Coin tossed %d times, heads = %d ,trails = %d",count,heads,trails);
    }
}
