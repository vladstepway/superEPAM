package by.stepovoy.ex3;

public class  CircleSquareLogic {

    public static double circleSquare(double outRadius, double inRadius) {

        return outRadius > inRadius ? Math.PI * (Math.pow(outRadius, 2) - Math.pow(inRadius, 2))
                                    : Math.PI * (Math.pow(inRadius, 2) - Math.pow(outRadius, 2));
    }

}
