package by.stepovoy.task03.ex1;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("First point");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Second point");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Third point");
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        if (PointOfTriangle.isVertextOfTriangle(x1,y1,x2,y2,x3,y3)){
            System.out.println("Right vertexes of triangle");
            if (PointOfTriangle.isOrthogonalTriangle(x1,y1,x2,y2,x3,y3)){
                System.out.println("It is an orthogonal triangle");
            }
            else System.out.println("Its not an orthogonal triangle");
        }
        else System.out.println("Not right vertexes of triangle");

    }
}
