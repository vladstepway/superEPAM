package by.stepovoy.ex4;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String message;
        message = UpDownNumberLogic.isUpOrDown(num);
        System.out.println(message);
    }
}
