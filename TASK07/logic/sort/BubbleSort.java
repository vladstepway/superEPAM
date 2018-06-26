package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;

public class BubbleSort extends Sorter {
    @Override
    public void sort(AbstractContainer array) throws OutOfRangeException {
        boolean change = false;
        while (!change) {
            change = true;
            for (int j = 0; j < array.getCurrentSize() - 1; j++) {
                if (array.getUnit(j).getDamagePoints()
                        > array.getUnit(j + 1).getDamagePoints()) {
                    change = false;
                    swap(array.getUnit(j), array.getUnit(j + 1));
                }
            }
        }
    }

}
