package by.stepovoy.task07.logic.functions;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.model.container.AbstractContainer;

public interface Logicable {
    boolean isEmptyContainer(AbstractContainer array)
            throws EmptyContainerException;

}

