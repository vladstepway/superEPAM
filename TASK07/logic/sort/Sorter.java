package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;


public abstract class Sorter implements Sortable {

    public void sortByName(AbstractContainer array)
            throws EmptyContainerException, OutOfRangeException {
        if (!isEmptyContainer(array)) {
            new InsertionSort().sort(array);
        }
    }

    @Override
    public boolean isEmptyContainer(AbstractContainer array)
            throws EmptyContainerException {
        return array.isEmpty();
    }

    public abstract void sort(AbstractContainer array)
            throws OutOfRangeException;

    @Override
    public void swap(Unit unit1, Unit unit2) {
        Unit tmp = unit1;
        unit1 = unit2;
        unit2 = tmp;
    }
}

