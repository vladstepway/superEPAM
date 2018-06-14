package logic;

import entities.Unit;
import utility.DynamicArray;

public class ArmyLogic {


    public int calculateTotalDamage(DynamicArray array) {
        final int ERROR_CODE = -1;
        final int DEFAULT_DAMAGE = 0;
        if (!array.isEmpty()) {
            int totalDamage = DEFAULT_DAMAGE;
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getUnit(i) != null) {
                    totalDamage += array.getUnit(i).getDamagePoints();
                }

            }
            return totalDamage;
        }
        return ERROR_CODE;
    }

    public Unit findMostDamagable(DynamicArray array) {
        if (!array.isEmpty()) {
            Unit mostDamagable = array.getUnit(0);
            for (int i = 0; i < array.getSize(); i++) {
                if (mostDamagable.getDamagePoints() < array.getUnit(i).getDamagePoints()) {
                    mostDamagable = array.getUnit(i);
                }
            }
            return mostDamagable;
        }
        return null;
    }

    public DynamicArray findByName(DynamicArray array, String name) {
        DynamicArray nameArray = new DynamicArray();
        if (!array.isEmpty()) {
            for (int i = 0; i < array.getSize(); i++) {
                if (array.getUnit(i).getName().equals(name)){
                        nameArray.add(array.getUnit(i));
                }
            }
        }
        return nameArray;
    }
}
