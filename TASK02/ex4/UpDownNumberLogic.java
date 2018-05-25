package by.stepovoy.ex4;

public class UpDownNumberLogic {
    public static String isUpOrDown(int num){
        int a = num%10;
        int b = num/10%10;
        int c = num/100%10;
        int d = num/1000%10;
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        return (a<b && b<c && c<d) ? "number is going down" : " number is going up";
    }
}
