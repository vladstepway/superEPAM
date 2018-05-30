package by.stepovoy.task03.ex5;

public class GregorianCalendarLogic {
    public static final int MONTHS = 12;
    public static final int FEBRUARY_LEAP_DAYS = 29;
    public static final int FEBRUARY_DAYS = 28;
    public static final int DAYS_30_MONTHS = 30;
    public static final int DAYS_31_MONTHS = 31;
    public static final int FEBRUARY = 2;
    public static final int APRIL = 4;
    public static final int JUNE = 6;
    public static final int SEPTEMBER = 9;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;


    public static String getNextDate(int dd, int mm, int yyyy) {

        String date;
        
        if (isRightDay(dd) && isRightMonth(mm)) {
            if (dd < FEBRUARY_DAYS) {
                dd += 1;
            } else if (dd == FEBRUARY_DAYS) {
                if (mm == FEBRUARY && !isLeapYear(yyyy)) {
                    dd = 1;
                    mm += 1;
                } else {
                    dd += 1;
                }
            } else if (dd == FEBRUARY_LEAP_DAYS) {
                if (mm == FEBRUARY && isLeapYear(yyyy)) {
                    dd = 1;
                    mm += 1;
                } else if (mm == FEBRUARY && !isLeapYear(yyyy)) {
                    dd = -1;
                } else {
                    dd += 1;
                }
            } else if (dd == DAYS_30_MONTHS) {
                if (mm == APRIL || mm == JUNE || mm == SEPTEMBER || mm == NOVEMBER) {
                    dd = 1;
                    mm += 1;
                } else {
                    if (mm != FEBRUARY)
                        dd += 1;
                }
            } else if (mm == FEBRUARY && dd == DAYS_31_MONTHS) {
                dd = -1;
            } else if (mm == DECEMBER && dd == DAYS_31_MONTHS) {
                dd = 1;
                mm = 1;
                yyyy++;

            }
            if (dd > 0) {
                date = dd + "." + mm + "." + yyyy;
            } else {
                date = "Wrong day in February";
            }
        } else
            date = "Wrong date components";

        return date;
    }

    private static boolean isRightDay(int dd) {
        return dd > 0 && dd <= DAYS_31_MONTHS;
    }

    private static boolean isRightMonth(int mm) {
        return mm > 0 && mm < MONTHS;
    }


    public static boolean isLeapYear(int year) {
        if (year < 0 || year == 0)
            return false;
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            return true;
        else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else if (year % 4 == 0)
            return true;
        else
            return false;
    }

}

