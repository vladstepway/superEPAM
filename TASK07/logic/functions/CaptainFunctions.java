package by.stepovoy.task07.logic.functions;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;


public class CaptainFunctions {


    public static void add(AbstractContainer array, Unit... unit) {
      array.add(unit);
      }

    public static Unit getUnit(int index, AbstractContainer array) throws OutOfRangeException {
        return array.getUnit(index);
    }

    private static boolean contains(Unit unit, AbstractContainer array) {
        return array.contains(unit);
    }

    public static void remove(int index, AbstractContainer array) throws OutOfRangeException {
        array.remove(index);
    }

    public static boolean isEmpty(AbstractContainer array) {
        return array.getCurrentSize() == 0;
    }

    public static void clear(AbstractContainer array) {
        array.clear();
    }

}
