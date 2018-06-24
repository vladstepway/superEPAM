package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.model.container.DynamicArray;

public interface Logicable {
    boolean isEmptyContainer(DynamicArray array) throws EmptyContainerException;

}

