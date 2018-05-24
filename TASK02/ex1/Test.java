package by.stepovoy.ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
        if(DifferentNumbers.differenceChecker(a,b,c))
            System.out.println("Different numbers");
        else
            System.out.println("You have the same numbers");
    }
}
