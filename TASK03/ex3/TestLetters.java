package by.stepovoy.task03.ex3;

import java.util.Scanner;

public class TestLetters {
    public static void main(String[] args) {
        System.out.println("Enter letter to check");
        Scanner in = new Scanner(System.in);

        char v1 = in.next().charAt(0);
        if (VowelLettersLogic.isVowel1(v1)) {
            System.out.println(v1 + " is vowel letter");
        } else {
            System.out.println(v1 + " is not a vowel letter");
        }

        char v2 = in.next().charAt(0);
        if (VowelLettersLogic.isVowel2(v2)) {
            System.out.println(v2 + " is vowel letter");
        } else {
            System.out.println(v2 + " is not a vowel letter");
        }
        char v3 = in.next().charAt(0);
        if (VowelLettersLogic.isVowel3(v3)) {
            System.out.println(v3 + " is vowel letter");
        } else {
            System.out.println(v3 + " is not a vowel letter");
        }

        String v4 = String.valueOf(in.next().charAt(0));
        if (VowelLettersLogic.isVowel4(v4)) {
            System.out.println(v4 + " is vowel letter");
        } else {
            System.out.println(v4 + " is not a vowel letter");
        }

        char v5 = in.next().charAt(0);
        if (VowelLettersLogic.isVowel5(v5)) {
            System.out.println(v5 + " is vowel letter");
        } else {
            System.out.println(v5 + " is not a vowel letter");
        }
    }
}
