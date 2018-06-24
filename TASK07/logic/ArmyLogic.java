package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;

import by.stepovoy.task07.model.entities.Unit;
import by.stepovoy.task07.model.container.DynamicArray;

public class ArmyLogic {


    public static int calculateTotalDamage(DynamicArray array)
            throws EmptyContainerException {
        final int DEFAULT_DAMAGE = 0;
        Unit[] units = array.getUnits();

        if (!array.isEmpty()) {
            int totalDamage = DEFAULT_DAMAGE;
            for (int i = 0; i < array.getSize(); i++) {
                totalDamage += units[i].getDamagePoints();
            }
            return totalDamage;
        } else {
            throw new EmptyContainerException("Container is empty!");
        }
    }


}
