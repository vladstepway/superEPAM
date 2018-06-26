package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.logic.functions.Logicable;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;

public interface Sortable extends Logicable {
    void sort(AbstractContainer array) throws OutOfRangeException;

    void swap(Unit unit1, Unit unit2);
}
