package by.stepovoy.task03.ex1;

public class PointOfTriangle {

    public static boolean isVertextOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double AC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        if (AB + BC > AC && AB + AC > BC && AC + BC > AB)
            return true;
        else
            return false;
    }

    public static boolean isOrthogonalTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double AC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        if (Math.pow(AB, 2) + Math.pow(BC, 2) == Math.pow(AC, 2)) {
            return true;
        } else if (Math.pow(BC, 2) + Math.pow(AC, 2) == Math.pow(AB, 2)){
            return true;
        }else if (Math.pow(AB,2)+Math.pow(AC,2) == Math.pow(BC,2)){
            return true;
        }else return false;
    }

}
