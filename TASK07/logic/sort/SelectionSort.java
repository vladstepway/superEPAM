package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;

public class SelectionSort extends Sorter {

    @Override
    public void sort(AbstractContainer array) throws OutOfRangeException {
        for (int i = 0; i < array.getCurrentSize() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.getCurrentSize(); j++)
                if (array.getUnit(j).getDamagePoints()
                        < array.getUnit(index).getDamagePoints())
                    index = j;
            swap(array.getUnit(index), array.getUnit(i));
        }
    }
}
