package by.stepovoy.task04.ex1;

import java.util.Random;


/**
 * This class represents logic of tossing a coin
 * HeadsAntTrailsLogic.java
 *
 * @author VaRRiK
 * @version 1.8 5/31/2018
 *
 */


public class HeadsAndTrailsLogic {


    /**
     *
     * this method toss coin
     *
     * @return number of heads
     *
     */
    public static int tossCoin(int num) {
        int countHead = 0;
        boolean head = false;
        Random random = new Random();

        /**
         * this loop generate tossing of coin by random order
         * */
        for (int counter = 1; counter <= num; counter++) {
            head = random.nextBoolean();
            if (head) {
                countHead++;
            }
        }

        return countHead;
    }

    /**]
     * This method count number of trails
     *
     * @param numToss number of flips
     * @param heads number of heads
     * @return Return number of trails
     */
    public static int countTrails(int numToss,int heads) {
        return numToss - heads;
    }
}
