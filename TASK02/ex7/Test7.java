package by.stepovoy.ex7;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("Before :\n x = %d\n y = %d\n",x,y);
       String swapedNumbers = SwapNumberLogic.swapNumbers(x,y);
        System.out.println("After :\n"+ swapedNumbers);
    }
}
