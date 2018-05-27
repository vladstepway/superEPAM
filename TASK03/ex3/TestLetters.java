package by.stepovoy.task03.ex3;

import java.util.Scanner;

public class TestLetters {
    public static void main(String[] args) {
        System.out.println("Enter letter to check");
        Scanner in = new Scanner(System.in);

        char v1 = in.next().charAt(0);
        String isVowelLetter1 = VowelLettersLogic.isVowel1(v1);
        System.out.println(isVowelLetter1);

        char v2 = in.next().charAt(0);
        String isVowelLetter2 = VowelLettersLogic.isVowel2(v2);
        System.out.println(isVowelLetter2);

        char v3 = in.next().charAt(0);
        String isVowelLetter3 = VowelLettersLogic.isVowel3(v3);
        System.out.println(isVowelLetter3);

        String v4 = String.valueOf(in.next().charAt(0));
        String isVowelLetter4 = VowelLettersLogic.isVowel4(v4);
        System.out.println(isVowelLetter4);
    }
}
