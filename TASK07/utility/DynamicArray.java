package utility;

import entities.Unit;

import java.util.Arrays;

public class DynamicArray {
    private Unit[] units;
    private int size;

    public DynamicArray() {
        units = new Unit[size];
    }

    public DynamicArray(Unit[] unit) {
        units = Arrays.copyOf(unit, unit.length);
    }

    public void add(Unit... unit) {
        int currentSize = getSize();
        size += unit.length;
        units = Arrays.copyOf(units, size);
        for (int i = 0; i < unit.length; i++) {
            units[currentSize + i] = unit[i];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Unit getUnit(int index) {
        rangeCheck(index);

        if (contains(units[index])) {
            return units[index];
        }
        return null;
    }

    public boolean contains(Unit unit) {
        return indexOf(unit) >= 0;
    }

    private int indexOf(Unit unit) {
        if (unit == null) {
            for (int i = 0; i < size; i++) {
                if (units[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (unit.equals(units[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void remove(int index) {
        rangeCheck(index);

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(units, index + 1, units, index,
                    numMoved);
        }
        units[--size] = null;
    }

    public Unit[] getUnits() {
        return units;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            units[i] = null;
        }
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "units = \n" + Arrays.toString(units) +
                '}';
    }
}
