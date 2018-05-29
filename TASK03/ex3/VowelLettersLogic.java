package by.stepovoy.task03.ex3;

public class VowelLettersLogic {

    public final static char[] VOWELS = {'a', 'A', 'e', 'E', 'I', 'i', 'O', 'U', 'Y', 'o', 'u', 'y'};
    public final static String VOWELS1 = "aAeEiIoOuUyY";

    public static boolean isVowel1(char v1) {

        boolean isVowelLetter = false;

        for (int i = 0; i < VOWELS.length; i++) {
            if (VOWELS[i] == v1) {
                isVowelLetter = true;
                break;
            }
        }
        return isVowelLetter;
    }

    public static boolean isVowel2(char v2) {
        v2 = Character.toLowerCase(v2);
        boolean flag = false;
        switch (v2) {
            case 'a': {
            }
            case 'e': {
            }
            case 'u': {
            }
            case 'i': {
            }
            case 'o': {
            }
            case 'y': {
                flag = true;
                break;
            }
            default: {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isVowel3(char v3) {

        if (v3 == 'A' || v3 == 'a') {
            return true;
        } else if (v3 == 'E' || v3 == 'e') {
            return true;
        } else if (v3 == 'I' || v3 == 'i') {
            return true;
        } else if (v3 == 'O' || v3 == 'O') {
            return true;
        } else if (v3 == 'U' || v3 == 'u') {
            return true;
        } else if (v3 == 'Y' || v3 == 'y') {
            return true;
        } else
            return false;

    }

    public static boolean isVowel4(String v4) {

        return v4.matches("^(?i:[aeuiyo]).*");
    }

    public static boolean isVowel5(char v5) {

        return VOWELS1.contains("" + v5);
    }
}
