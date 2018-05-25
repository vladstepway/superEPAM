package by.stepovoy.ex6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int reversedN = ReverseLogic.reverseNumber(N);
        System.out.println(reversedN);

    }
}
