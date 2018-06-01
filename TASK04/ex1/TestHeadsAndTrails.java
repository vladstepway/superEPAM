package by.stepovoy.task04.ex1;

import by.stepovoy.task04.ex1.HeadsAndTrailsLogic;

import java.util.Scanner;

public class TestHeadsAndTrails {
    public static void main(String[] args) {
        System.out.println("Enter ,how many times to toss a coin :");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int heads = HeadsAndTrailsLogic.tossCoin(count);

        System.out.printf("Coin tossed %d , heads = %d ,trails = %d",count,heads,count-heads);
    }
}
