package by.stepovoy.task03.ex2;

public class DragonHeadsLogic {

    public final static int NUM_EYES = 2;
    public final static int NUM_HEADS_B4_200 = 3;
    public final static int NUM_HEADS_AFTER_200 = 2;
    public final static int NUM_HEADS_AFTER_300 = 1;
    public final static int BORDER_BEFORE_200 = 199;
    public final static int BORDER_BEFORE_300 = 299;

    public static int countHeads(int year) {
        int heads = NUM_HEADS_B4_200;

        if (year < 0) {
            heads = -1;
        } else if (year == 0) {
            heads = NUM_HEADS_B4_200;
        } else if (year <= BORDER_BEFORE_200) {
            heads += year * NUM_HEADS_B4_200;
        } else if (year <= BORDER_BEFORE_300 && year > BORDER_BEFORE_200) {
            heads += BORDER_BEFORE_200 * NUM_HEADS_B4_200;
            heads += (year - BORDER_BEFORE_200) * NUM_HEADS_AFTER_200;
        } else if (year > BORDER_BEFORE_300) {
            heads += BORDER_BEFORE_200 * NUM_HEADS_B4_200;
            heads += (BORDER_BEFORE_300 - BORDER_BEFORE_200) * NUM_HEADS_AFTER_200;
            heads += (year - BORDER_BEFORE_300) * NUM_HEADS_AFTER_300;
        }
        return heads;
    }

    public static int countEyes(int heads) {
        return heads * NUM_EYES;
    }

}
