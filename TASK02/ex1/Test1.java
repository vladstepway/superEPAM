package by.stepovoy.ex1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Different number : " + DifferentNumbers.differenceChecker(a, b, c));
    }
}
