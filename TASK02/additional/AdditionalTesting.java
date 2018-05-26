package by.stepovoy.additional;

import java.util.Scanner;

public class AdditionalTesting {
    public static void main(String[] args) {
        //System.out.println("Parity of numbers :");
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println("Numbers have the same parity : "+ParityOfNumberLogic.checkParity(a,b,c));

//        System.out.println("Palindrom number : ");
//        int N = in.nextInt();
//        System.out.println("Is number "+N+" a palindrom : "+PalindromNumber.isPalindrom(N));

//        System.out.println("Triangle sides :");
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        System.out.println("Is right sides of triangle :"+TriangleSideLogic.isTriangleSide(x,y,z));

        System.out.println("Point of rectangle :");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("Top left point of rectangle");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        System.out.println("Right bottom point of rectangle");
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        System.out.printf("Point (%d,%d) belongs to rectangle : %b",x1,y1,PointOfRectangleLogic.isRectanglePoint(x1,y1,x2,x3,y2,y3));
    }


}
