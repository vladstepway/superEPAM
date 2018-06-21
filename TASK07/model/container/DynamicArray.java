package by.stepovoy.task07.model.container;

import by.stepovoy.task07.model.entities.Unit;

import java.util.Arrays;

public class DynamicArray {
    private Unit[] units;
    private int size;
    private int capacity = 10;
    private static final int DEFAULT_MEMORY = 10;


    public DynamicArray() {
        units = new Unit[size];
    }


    public DynamicArray(Unit[] unit) {
        units = Arrays.copyOf(unit, unit.length);
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }


    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            units[i] = null;
        }
        setSize(0);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Unit... unit) {
        int currentSize = getSize() + unit.length;
        Unit[] temp = Arrays.copyOf(units, currentSize);
        for (int i = getSize(), j = 0; i < currentSize; i++, j++) {
            temp[i] = unit[j];
        }
        setSize(getSize() + unit.length);
        setUnits(temp);
    }

    public Unit getUnit(int index) {
        rangeCheck(index);
        if (contains(units[index - 1])) {
            return units[index - 1];
        }
        return null;
    }

    public boolean contains(Unit unit) {
        for (int i = 0; i < getSize(); i++) {
            if (units[i].equals(unit)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        rangeCheck(index);
        int currentSize = getSize() - 1;
        for (int i = index; i < currentSize; i++) {
            units[i] = units[i + 1];
        }
        setSize(currentSize);
    }

    private void rangeCheck(int index) {
        if (index >= getSize())
            throw new IndexOutOfBoundsException();
    }


    @Override
    public String toString() {
        return Arrays.toString(units);
    }

}



