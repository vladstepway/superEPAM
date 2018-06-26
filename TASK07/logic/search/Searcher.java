package by.stepovoy.task07.logic.search;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;

import by.stepovoy.task07.model.entities.Unit;


public abstract class Searcher implements Searchable {

    public abstract Unit search(AbstractContainer array);

    public boolean isEmptyContainer(AbstractContainer array)
            throws EmptyContainerException {
        return array.isEmpty();
    }

    public Unit findMostDamagable(AbstractContainer array)
            throws EmptyContainerException {
        if (!isEmptyContainer(array)) {
            return new LinearSearch().search(array);
        } else throw new EmptyContainerException("Container is empty!");
    }

    public int findByName(AbstractContainer array, String name)
            throws EmptyContainerException, OutOfRangeException {
        if (!isEmptyContainer(array)) {
            return new BinarySearch().searchBinary(array,name,0,array.getCurrentSize()-1);
        } else throw new EmptyContainerException("Container is empty!");
    }
}

