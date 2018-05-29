package by.stepovoy.task03.ex4;

public class MoodSensorLogic {
    public static final String GOOD_MOOD = ":)";
    public static final String POKER_FACE = ":|";
    public static final String SAD = ":(";

    public static String getMood(int number) {
        String mood;

        if (number < 0) {
            mood = SAD;
        } else if (number == 0) {
            mood = POKER_FACE;
        } else
            mood = GOOD_MOOD;

        return mood;
    }
}
