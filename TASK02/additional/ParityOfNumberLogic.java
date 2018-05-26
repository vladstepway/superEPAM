package by.stepovoy.additional;

public class ParityOfNumberLogic {
    public static boolean checkParity(int a, int b, int c) {
        return (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) ? true : false;
    }
}

class PalindromNumber {
    public static boolean isPalindrom(int num) {

        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100 % 10;
        int d = num / 1000 % 10;
        return (a == d && b == c) ? true : false;
    }

}

class TriangleSideLogic {
    public static boolean isTriangleSide(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a) ? true : false;
    }
}
class PointOfRectangleLogic{

    public static boolean isRectanglePoint(int x,int y,int x1,int x2,int y1,int y2){
        return (x >= x1 && x<=x2 && y >=y2 && y<=y1) ? true : false;
    }
}