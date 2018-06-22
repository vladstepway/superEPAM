package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

public abstract class Sorter implements Sortable {
    public static void sortByName(DynamicArray array) throws EmptyContainerException {
        if (!isEmptyContainer(array)) {
            new InsertionSort().sort(array);
        }
    }

    private static boolean isEmptyContainer(DynamicArray array) throws EmptyContainerException {
        return array.isEmpty();
    }


    public abstract Unit[] sort(DynamicArray array);

    @Override
    public void swap(Unit unit1, Unit unit2) {
        Unit tmp = unit1;
        unit1 = unit2;
        unit2 = tmp;
    }
}

class InsertionSort extends Sorter {
    public Unit[] sort(DynamicArray array) {
        Unit[] units = array.getUnits();
        for (int j = 1; j < array.getSize(); j++) {
            Unit unit = units[j];
            int i = j - 1;
            while (i >= 0
                    && less(unit.getName(), units[i].getName())) {
                units[i + 1] = units[i];
                i--;
            }
            units[i + 1] = unit;
        }
        return units;
    }

    private static boolean less(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }
}

class BubbleSort extends Sorter {
    public Unit[] sort(DynamicArray array) {
        Unit[] units = array.getUnits();

        boolean change = false;
        while (!change) {
            change = true;
            for (int j = 0; j < units.length - 1; j++) {
                if (units[j].getDamagePoints() > units[j + 1].getDamagePoints()) {
                    change = false;
                    swap(units[j], units[j + 1]);
                }
            }
        }
        return units;
    }

}

class SelectionSort extends Sorter {

    @Override
    public Unit[] sort(DynamicArray array) {
        Unit[] units = array.getUnits();
        for (int i = 0; i < units.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < units.length; j++)
                if (units[j].getDamagePoints() < units[index].getDamagePoints())
                    index = j;
            swap(units[index], units[i]);
        }
        return units;
    }

}

