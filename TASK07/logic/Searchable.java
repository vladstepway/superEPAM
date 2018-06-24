package by.stepovoy.task07.logic;

import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

public interface Searchable extends Logicable{
    Unit search(DynamicArray array);
}
