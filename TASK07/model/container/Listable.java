package by.stepovoy.task07.model.container;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;

public interface Listable<E> {
    boolean add(E e);
    boolean add(E...e);
    int getCurrentSize();
    boolean isEmpty() throws EmptyContainerException;
    E getUnit(int index) throws OutOfRangeException;
    void remove(int index) throws OutOfRangeException;
    void clear();
    boolean contains(E e);
    void rangeCheck(int index) throws OutOfRangeException;

}
