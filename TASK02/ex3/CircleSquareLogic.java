package by.stepovoy.ex3;

public class CircleSquareLogic {

    public static double circleSquare(double outRadius, double inRadius) {

        return outRadius > inRadius ? 3.14 * (Math.pow(outRadius, 2) - Math.pow(inRadius, 2))
                                    : 3.14 * (Math.pow(inRadius, 2) - Math.pow(outRadius, 2));
    }

}
