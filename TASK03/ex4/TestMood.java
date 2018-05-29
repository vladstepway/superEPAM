package by.stepovoy.task03.ex4;

import java.util.Random;
import java.util.Scanner;

public class TestMood {
    public static void main(String[] args) {

        int max;
        int min;

        Random random = new Random();

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter max bound :");
            max = in.nextInt();
            if (max > 0) {
                System.out.println("Enter min bound :");
                min = in.nextInt();
                if (min < 0) {
                    int rand = random.nextInt(max - min + 1) + min;
                    String mood = MoodSensorLogic.getMood(rand);
                    System.out.println("number " + rand+" is "+mood);
                    break;
                } else {
                    System.out.println("min bound should be negative");
                }
            } else {
                System.out.println("max bound should be positive");
            }
        }
    }
}
