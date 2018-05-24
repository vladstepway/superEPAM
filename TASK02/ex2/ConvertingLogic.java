package by.stepovoy.ex2;

public class ConvertingLogic {

    public static double convertToMilligrams(double kg) {
        return kg*1_000_000.0;
    }

    public static double convertToGrams(double kg) {
        return kg*1000.0;
    }

    public static double convertToTones(double kg) {
        return kg/1000.0;
    }
}
