package by.stepovoy.task07.utility;

import by.stepovoy.task07.logic.CaptainFunctions;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Archer;
import by.stepovoy.task07.model.entities.Magician;
import by.stepovoy.task07.model.entities.Warrior;

import java.util.Random;

public class ArmyCreator {

    public static final int NUMBER_OF_NAMES = 5;


    private static final String NAMES[] = {"Hrogeirr",
            "Broddi", "Egill", "Ulf", "Bjorg"};
    private static final int[] HEALTH_WARRIOR = {1000, 750, 500, 250, 100};
    private static final int[] DAMAGE_WARRIOR = {500, 531, 456, 875, 2134};
    private static final String[] SKILL_WARRIOR = {"Devastator", "Madness",
            "Blood shower", "Massacre", "Crusher"};
    private static final String[] CLASS_WARRIOR = {"Gladiator", "General",
            "Paladin", "Pathfinder", "Barbarian"};

    private static final int[] HEALTH_MAGICIAN = {300, 154, 124, 67, 257};
    private static final int[] DAMAGE_MAGICIAN = {150, 54, 361, 235, 125};
    private static final String[] SKILL_MAGICIAN = {"Fire ball", "Teleportation",
            "Freezing", "Earthquake", "Projection"};
    private static final int[] MANA_MAGICIAN = {150, 54, 361, 235, 125};

    private static final int[] HEALTH_ARCHER = {120, 96, 84, 91, 200};
    private static final int[] DAMAGE_ARCHER = {600, 235, 675, 352, 874};
    private static final String[] SKILL_ARCHER = {"Hail of arrows", "Aiming shot",
            "Piercing shot", "Escape", "Entangling arrow"};
    private static final int[] ACCURACY_ARCHER = {599, 421, 542, 653, 357};

    private static final int LOW_BORDER = 25;
    private static final int MAX_BORDER = 100;



    public static DynamicArray createArmy(int num) {
        Random random = new Random(System.currentTimeMillis());
        DynamicArray array = new DynamicArray(num);


        int size = random.nextInt(num - 1);
        int randNumber = random.nextInt(MAX_BORDER);
        if (size > 0 && size <= num) {
            for (int i = 0; i < size; i++) {
                if (randNumber>0 && randNumber<LOW_BORDER){
                    CaptainFunctions.add(array,createArcher());
                }else if(randNumber >LOW_BORDER){
                    CaptainFunctions.add(array,createMagician());
                }else {
                    CaptainFunctions.add(array,createWarrior());
                }
            }
        } else
            return null;
        return array;
    }

    public static Warrior createWarrior() {
        Random random = new Random(System.currentTimeMillis());
        int name = random.nextInt(NUMBER_OF_NAMES);
        Warrior warrior = new Warrior(NAMES[name], HEALTH_WARRIOR[name],
                DAMAGE_WARRIOR[name], SKILL_WARRIOR[name], CLASS_WARRIOR[name]);
        return warrior;
    }

    public static Archer createArcher() {
        Random random = new Random(System.currentTimeMillis());

        int name = random.nextInt(NUMBER_OF_NAMES);

        Archer archer = new Archer(NAMES[name],
                HEALTH_ARCHER[name],
                DAMAGE_ARCHER[name],
                SKILL_ARCHER[name],
                ACCURACY_ARCHER[name]);
        return archer;
    }

    public static Magician createMagician() {
        Random random = new Random(System.currentTimeMillis());

        int name = random.nextInt(NUMBER_OF_NAMES);

        Magician mag = new Magician(NAMES[name],
                HEALTH_MAGICIAN[name],
                DAMAGE_MAGICIAN[name],
                SKILL_MAGICIAN[name],
                MANA_MAGICIAN[name]);

        return mag;
    }


}

