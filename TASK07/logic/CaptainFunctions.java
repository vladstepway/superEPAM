package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;


public class CaptainFunctions {


    public static void add(DynamicArray array, Unit... unit) {
      array.add(unit);
      }

    public static Unit getUnit(int index, DynamicArray array) throws OutOfRangeException {
        return array.getUnit(index);
    }

    private static boolean contains(Unit unit, DynamicArray array) {
        return array.contains(unit);
    }

    public static void remove(int index, DynamicArray array) throws OutOfRangeException {
        array.remove(index);
    }

    public static boolean isEmpty(DynamicArray array) {
        return array.getSize() == 0;
    }

    public static void clear(DynamicArray array) {
        array.clear();
    }

}
