package by.stepovoy.ex7;

public class SwapNumberLogic {
    public static String swapNumbers(int x, int y) {
        x = x - y;
        y = x + y;
        x = y - x;
        return "x = "+x+", y = "+y;
    }
}
