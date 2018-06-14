
import entities.Magician;
import entities.Warrior;
import logic.ArmyLogic;
import utility.DynamicArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        DynamicArray army = new DynamicArray();
        ArmyLogic damage = new ArmyLogic();

        Magician soldier1 = new Magician("Gan", 100,
                30, "Blizzard", 87);
        Magician soldier2 = new Magician("Vega", 80,
                90, "Heal", 90);
        Magician soldier3 = new Magician("Avril", 95,
                100, "EarthQuake", 105);
        Warrior soldier4 = new Warrior("Rufio", 100,
                120, "Gladiator", "Blade Dance");
        Warrior soldier5 = new Warrior("Avalon", 100,
                97, "General", "War Horn");
        Warrior soldier6 = new Warrior("Virion", 100,
                140, "Paladin", "Summon Swordsmen");

        army.add(soldier1, soldier2, soldier3, soldier4, soldier5, soldier6);

        System.out.println(army.toString());

        DynamicArray copyArmy = new DynamicArray(army.getUnits());

        System.out.println("Copy constructor\n"+copyArmy.toString());

        army.remove(3);
        System.out.println(army.toString());


        System.out.println("size = " + army.getSize());

        System.out.println("total damage  =" + damage.calculateTotalDamage(army) + " points");

        System.out.println("Most damagable unit -" + damage.findMostDamagable(army).toString());

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String name = read.readLine();

        System.out.println("Unit with name "+name+" :"+damage.findByName(army,name));

        army.clear();
        System.out.println(army.toString());
        System.out.println(army.isEmpty());



    }
}
