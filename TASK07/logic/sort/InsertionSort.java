package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;

public class InsertionSort extends Sorter {
    @Override
    public void sort(AbstractContainer array) throws OutOfRangeException {
        for (int i = 1; i < array.getCurrentSize(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.getUnit(j).getHealthPoints()
                        < array.getUnit(j - 1).getHealthPoints()) {
                    swap(array.getUnit(j), array.getUnit(j - 1));
                }
            }
        }
    }
}
