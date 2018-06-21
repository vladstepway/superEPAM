package by.stepovoy.task07;

import by.stepovoy.task07.utility.ArmyCreator;
import by.stepovoy.task07.logic.ArmyLogic;
import by.stepovoy.task07.logic.CaptainFunctions;
import by.stepovoy.task07.logic.Sorter;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.view.Printer;

public class Test {
    public static void main(String[] args) {

        int num = 10;
        DynamicArray array = ArmyCreator.createArmy(num);
        Printer.print(array);

        Printer.print("Army is empty :"+CaptainFunctions.isEmpty(array));
        int deleteNumber = 3;
        CaptainFunctions.remove(deleteNumber, array);
        Printer.print(array);
        int findNumber = 5;
        Printer.print("Soldier with index 5 " + CaptainFunctions.getUnit(findNumber,array));

        String name = "Ulf";
        Printer.print("Soldiers with name "+name+" "+ArmyLogic.findByName(array,name));

        Printer.print("Total damage of the army = "+ArmyLogic.calculateTotalDamage(array));
        Printer.print("Most damageable person is "+ArmyLogic.findMostDamagable(array));

        Printer.print(array);
        Sorter.sortByName(array);
        Printer.print(array);

        CaptainFunctions.clear(array);
        Printer.print(array);
    }
}
