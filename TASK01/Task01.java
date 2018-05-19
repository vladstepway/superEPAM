package com.stepovoy.epam;

import java.io.IOException;
import java.util.Scanner;


public class Task01 {
//    public static void display(int value) {
//        System.out.println("Binary = "+Integer.toBinaryString(value)+" , Decimal = "+value);
//    }
    public static void main(String[] args)   {


        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
            //little menu for choosing type to test
                TypeTester.TextMenu();
                TypeTester.Type type = TypeTester.Type.valueOf(sc.next());
                TypeTester.chooseType(type);//
            } catch (IllegalArgumentException e) {
                System.out.println("Error " + e);
            }
        }


    }

}
