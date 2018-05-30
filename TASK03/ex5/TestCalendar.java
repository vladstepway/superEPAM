package by.stepovoy.task03.ex5;

import java.util.Scanner;

public class TestCalendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        String date = GregorianCalendarLogic.getNextDate(day, month, year);
        System.out.println(date);

    }
}
