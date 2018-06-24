package by.stepovoy.task07;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.utility.ArmyCreator;
import by.stepovoy.task07.logic.ArmyLogic;
import by.stepovoy.task07.logic.CaptainFunctions;
import by.stepovoy.task07.logic.Sorter;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.view.Printer;

public class Test {
    public static void main(String[] args) {

        DynamicArray array = null;
        int num = 10;
        int findNumber = 3;
        int deleteNumber = 2;
        try {

            array = ArmyCreator.createArmy(num);

            Printer.print(array);

            Printer.print("Army is empty :" + CaptainFunctions.isEmpty(array));

            CaptainFunctions.remove(deleteNumber, array);

            Printer.print(array);

            Printer.print("Soldier with index 5 " + CaptainFunctions.getUnit(findNumber, array));

        } catch (OutOfRangeException e) {
            e.printStackTrace();
        }

        String name = "Ulf";
        try {
            Printer.print("Soldiers with name " + name + " " + ArmyLogic.findByName(array, name));

            Printer.print("Total damage of the army = " + ArmyLogic.calculateTotalDamage(array));

            Printer.print("Most damageable person is " + ArmyLogic.findMostDamagable(array));

            Printer.print(array);

            Sorter.sortByName(array);
        } catch (EmptyContainerException e) {
            e.printStackTrace();
        } catch (OutOfRangeException e) {
            e.printStackTrace();
        }
        Printer.print(array);

        CaptainFunctions.clear(array);
        Printer.print(array);
    }
}
