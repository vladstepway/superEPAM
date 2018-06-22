package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.model.entities.Unit;
import by.stepovoy.task07.model.container.DynamicArray;

public class ArmyLogic {


    public static int calculateTotalDamage(DynamicArray array) throws EmptyContainerException {
        final int ERROR_CODE = -1;
        final int DEFAULT_DAMAGE = 0;
        Unit[] units = array.getUnits();

        if (!array.isEmpty()) {
            int totalDamage = DEFAULT_DAMAGE;
            for (int i = 0; i < array.getSize(); i++) {
                totalDamage += units[i].getDamagePoints();
            }
            return totalDamage;
        }
        return ERROR_CODE;
    }

    public static Unit findMostDamagable(DynamicArray array) throws EmptyContainerException {
        if (!array.isEmpty()) {
            Unit[] units = array.getUnits();
            Unit mostDamagable = units[0];
            for (int i = 0; i < array.getSize(); i++) {
                if (mostDamagable.getDamagePoints() < units[i].getDamagePoints()) {
                    mostDamagable = units[i];
                }
            }
            return mostDamagable;
        }
        return null;
    }

    public static Unit findByName(DynamicArray array, String name) throws EmptyContainerException {
        Unit[] units = array.getUnits();
        if (!array.isEmpty()) {
            for (int i = 0; i < array.getSize(); i++) {
                if (units[i].getName().equals(name)) {
                    return units[i];
                }
            }
        }
        return null;
    }
}
