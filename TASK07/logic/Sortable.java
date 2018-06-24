package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

public interface Sortable extends Logicable{
    void sort(DynamicArray array) throws OutOfRangeException;

    void swap(Unit unit1, Unit unit2);
}
