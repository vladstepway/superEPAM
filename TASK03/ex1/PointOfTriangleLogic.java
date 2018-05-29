package by.stepovoy.task03.ex1;

public class PointOfTriangleLogic {


    public static boolean isTopOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab = getSide(x1, y1, x2, y2);
        double bc = getSide(x2, y2, x3, y3);
        double ac = getSide(x3, y3, x1, y1);

        return ab + bc > ac && ab + ac > bc && ac + bc > ab;
    }

    public static double getSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static boolean isOrthogonalTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab = getSide(x1, y1, x2, y2);
        double bc = getSide(x2, y2, x3, y3);
        double ac = getSide(x3, y3, x1, y1);
        if (ab * ab + bc * bc == ac * ac) {
            return true;
        } else if (bc * bc + ac * ac == ab * ab) {
            return true;
        } else if (ab * ab + ac * ac == bc * bc) {
            return true;
        } else
            return false;
    }

}
