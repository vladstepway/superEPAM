package by.stepovoy.ex6;

public class ReverseLogic {
    public static int reverseNumber(int n){

        int reverse = n%10;
        n/=10;
        reverse=reverse*10 +n%10;
        n/=10;
        reverse=reverse*10 +n%10;
        n/=10;
        reverse=reverse*10 +n%10;
        n/=10;
        reverse=reverse*10 +n%10;
        n/=10;
        reverse=reverse*10 +n%10;
        n/=10;
        reverse=reverse*10 +n%10;

        //System.out.println(reverse);
        return reverse;
    }
}
