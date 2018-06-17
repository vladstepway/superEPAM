package by.stepovoy.task07.logic;

import by.stepovoy.task07.model.utility.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

import java.util.Arrays;

public class CaptainFunctions {


    public static void add(DynamicArray array, Unit... unit) {
        Unit[] units = array.getUnits();
        int currentSize = array.getSize() + unit.length;
        Unit[] temp = Arrays.copyOf(units, currentSize);

        for (int i = array.getSize(), j = 0; i < currentSize; i++, j++) {
            temp[i] = unit[j];
        }
        array.setSize(array.getSize() + unit.length);
        array.setUnits(temp);
    }

    public static Unit getUnit(int index, DynamicArray array) {
        rangeCheck(index, array);
        Unit[] units = array.getUnits();
        if (contains(units[index - 1], array)) {
            return units[index - 1];
        }
        return null;
    }

    private static boolean contains(Unit unit, DynamicArray array) {
        Unit[] units = array.getUnits();
        for (int i = 0; i < array.getSize(); i++) {
            if (units[i].equals(unit)) {
                return true;
            }
        }
        return false;
    }

    public static void remove(int index, DynamicArray array) {
        rangeCheck(index, array);
        Unit[] units = array.getUnits();
        int currentSize = array.getSize() - 1;
        for (int i = index; i < currentSize; i++) {
            units[i] = units[i + 1];

        }
    }

    public static boolean isEmpty(DynamicArray array) {
        return array.getSize() == 0;
    }

    public static void clear(DynamicArray array) {
        Unit[] units = array.getUnits();
        for (int i = 0; i < array.getSize(); i++) {
            units[i] = null;
        }
        array.setSize(0);
        array.setUnits(units);
    }

    private static void rangeCheck(int index, DynamicArray array) {
        if (index >= array.getSize())
            throw new IndexOutOfBoundsException();
    }
}
