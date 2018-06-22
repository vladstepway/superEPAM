package by.stepovoy.task07.model.container;


import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.entities.Unit;

import java.util.Arrays;

public class DynamicArray {
    private Unit[] units;
    private int size;
    private int capacity = 10;

    public DynamicArray() {
        capacity = 10;
        units = new Unit[capacity];
    }

    public DynamicArray(int memory) {

        units = new Unit[memory];
    }


    public DynamicArray(Unit[] unit) {
        units = Arrays.copyOf(unit, unit.length);
    }


    private void expand() {
        capacity *= 2;
        units = Arrays.copyOf(units, capacity);
    }

    public boolean isEmpty() throws EmptyContainerException {
        if (getSize() == 0) {
            throw new EmptyContainerException("Size of container is null");
        }
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

    public void add(Unit unit) {
        if (size >= capacity) {
            expand();
        }
        units[size++] = unit;
    }

    public void add(Unit... unit) {
        for (Unit unit1 : unit) {
            add(unit1);
        }
    }

    public Unit getUnit(int index) throws OutOfRangeException {
        rangeCheck(index);
        if (contains(units[index])) {
            return units[index];
        }
        return null;
    }

    public boolean contains(Unit unit) {
        for (int i = 0; i < size; i++) {
            if (units[i].equals(unit)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) throws OutOfRangeException {
        rangeCheck(index);
        System.arraycopy(units, index + 1,
                units, index, units.length - 1 - index);

    }

    private void rangeCheck(int index) throws OutOfRangeException {
        if (index >= getSize() || index < 0)
            throw new OutOfRangeException("Out of range!");
    }


    @Override
    public String toString() {
        return Arrays.toString(units);
    }

}



