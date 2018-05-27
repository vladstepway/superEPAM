package by.stepovoy.task03.ex3;

public class VowelLettersLogic {
    public static String isVowel1(char v1) {
        char[] vow = {'a', 'A', 'e', 'E', 'I', 'i', 'O', 'U', 'Y', 'o', 'u', 'y'};
        boolean isVowelLetter = false, isNumber = false;

        for (int i = 0; i < vow.length; i++) {
            if (vow[i] == v1) {
                isVowelLetter = true;
            } else if (v1 >= '0' && v1 <= '9') {
                isNumber = true;
            }
        }
        if (isVowelLetter) {
            return "Letter " + v1 + " is vowel";
        } else if (isNumber) {
            return v1 + " is a number";
        } else
            return "Letter " + v1 + " is consonant";
    }

    public static String isVowel2(char v2) {
        v2 = Character.toLowerCase(v2);
        String result;
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
                result = "Letter " + v2 + " is vowel";
                break;
            }
            default: {
                result = "Letter " + v2 + " is not vowel";
            }

        }
        return result;

    }

    public static String isVowel3(char v3) {
        String result;

        if (v3 == 'A' || v3 == 'a') {
            result = "Letter " + v3 + " is vowel";
        } else if (v3 == 'E' || v3 == 'e') {
            result = "Letter " + v3 + " is vowel";
        } else if (v3 == 'I' || v3 == 'i') {
            result = "Letter " + v3 + " is vowel";
        } else if (v3 == 'O' || v3 == 'O') {
            result = "Letter " + v3 + " is vowel";
        } else if (v3 == 'U' || v3 == 'u') {
            result = "Letter " + v3 + " is vowel";
        } else if (v3 == 'Y' || v3 == 'y') {
            result = "Letter " + v3 + " is vowel";
        } else result = "Letter " + v3 + " is not vowel";

        return result;
    }

    public static String isVowel4(String v4) {
        boolean isVowelLetter = false;
        String result;
        if (v4.matches("^(?i:[aeuiyo]).*")) {
            result = v4 + " is vowel";
        } else
            result = v4 + " is not vowel";
        return result;
    }
}
