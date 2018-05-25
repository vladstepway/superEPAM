package by.stepovoy.ex5;

public class AverageOfDigitsLogic {
    public static double averageArithmetic(int N){
        int a = N%10;
        int b = N/10%10;
        int c = N/100%10;
        int d = N/1000%10;
        int e = N/10_000%10;
        int f = N/100_000%10;
        return (double)(a+b+c+d+e+f)/6;
    }
    public static double averageGeometric(int N){
        int a = N%10;
        int b = N/10%10;
        int c = N/100%10;
        int d = N/1000%10;
        int e = N/10_000%10;
        int f = N/100_000%10;
        return Math.pow(a*b*c*d*e*f,1/6);
    }
}
