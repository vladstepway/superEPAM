package by.stepovoy.task07.model.container;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.entities.Unit;


import java.util.Arrays;

public class DynamicArray extends AbstractContainer {
    private int capacity = DEFAULT_MEMORY;

    public DynamicArray() {
        super();
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

    public boolean add(Unit unit) {
        if (currentSize >= capacity) {
            expand();
        }
        units[currentSize++] = unit;
        return true;
    }

    public boolean add(Unit... unit) {
        for (Unit unit1 : unit) {
            add(unit1);
        }
        return true;
    }



    public void remove(int index) throws OutOfRangeException {
        rangeCheck(index);
        System.arraycopy(units, index + 1,
                units, index, units.length - 1 - index);

    }

    @Override
    public String toString() {
        return Arrays.toString(units);
    }

}



