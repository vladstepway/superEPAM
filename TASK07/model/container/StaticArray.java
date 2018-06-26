package by.stepovoy.task07.model.container;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.entities.Unit;

public class StaticArray extends AbstractContainer {
    private int maxSize;

    public StaticArray() throws OutOfRangeException {
        this(DEFAULT_MEMORY);
    }

    public StaticArray(int size) throws OutOfRangeException {
        rangeCheck(size);
        maxSize = size;
        units = new Unit[maxSize];
        currentSize = 0;
    }
    StaticArray(Unit[] units) {
        Unit[] tmp = new Unit[this.units.length];
        this.units = tmp;
    }

    @Override
    public boolean add(Unit e) {
        if (currentSize < maxSize) {
            units[currentSize++] = e;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Unit... e) {
        int length = maxSize - currentSize;
        if (length >= e.length) {
            for (int i = 0; i < e.length; i++) {
                units[currentSize++] = e[i];
            }
            return true;
        }
        return false;
    }

    @Override
    public Unit getUnit(int index) throws OutOfRangeException {
        rangeCheck(index);
        return units[index];
    }

    @Override
    public void remove(int index) {
        Unit tmp;
        for (int i = 0; i < currentSize - 1;i++){

        }

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Unit e) {
        return false;
    }

    @Override
    public void rangeCheck(int index) throws OutOfRangeException {

    }


}
