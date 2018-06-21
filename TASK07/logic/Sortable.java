package by.stepovoy.task07.logic;

import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

public interface Sortable {
    void sort(DynamicArray array);
    void swap(Unit unit1,Unit unit2);
}
