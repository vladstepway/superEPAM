package by.stepovoy.task07.model.container;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.entities.Unit;

public abstract class AbstractContainer
        implements Listable<Unit> {

    final static int DEFAULT_MEMORY = 10;
    Unit[] units;
    protected int currentSize;

    public AbstractContainer() {
        units = new Unit[DEFAULT_MEMORY];

    }

    public AbstractContainer(AbstractContainer container) {
        units = container.units;
        currentSize = container.currentSize;

    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public boolean isEmpty() throws EmptyContainerException {
        if (getCurrentSize() == 0) {
            throw new EmptyContainerException("Size of container is null");
        }
        return getCurrentSize() == 0;
    }

    public void rangeCheck(int index) throws OutOfRangeException {
        if (index >= getCurrentSize() || index < 0)
            throw new OutOfRangeException("Out of range!");
    }

    public Unit getUnit(int index) throws OutOfRangeException {
        rangeCheck(index);
        return units[index];
    }

    public void remove(int index) throws OutOfRangeException {
        rangeCheck(index);
        int numMoved = currentSize - index - 1;
        if (numMoved > 0) {
            System.arraycopy(units, index + 1, units, index, numMoved);
        }
        units[currentSize--] = null;
    }

    public void clear() {
        for (int i = 0; i < currentSize; i++) {
            units[i] = null;
        }
        setCurrentSize(0);
    }

    public boolean contains(Unit unit) {
        for (int i = 0; i < currentSize; i++) {
            if (unit.equals(units[i])) {
                return true;
            }
        }
        return false;
    }

    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }

    public void setUnit(int index, Unit unit) throws OutOfRangeException {
        rangeCheck(index);
        this.units[index] = unit;
    }


}
