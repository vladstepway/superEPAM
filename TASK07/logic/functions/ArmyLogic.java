package by.stepovoy.task07.logic.functions;

import by.stepovoy.task07.exception.EmptyContainerException;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;

public class ArmyLogic {
    public static int calculateTotalDamage(AbstractContainer array)
            throws EmptyContainerException, OutOfRangeException {
        final int DEFAULT_DAMAGE = 0;
        if (!array.isEmpty()) {
            int totalDamage = DEFAULT_DAMAGE;
            for (int i = 0; i < array.getCurrentSize(); i++) {
                if (array.contains(array.getUnit(i))) {
                    totalDamage += array.getUnit(i).getDamagePoints();
                }
            }
            return totalDamage;
        } else {
            throw new EmptyContainerException("Container is empty!");
        }
    }


}
