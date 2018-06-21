package by.stepovoy.task07.logic;

import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;

public class Sorter {
    public static void sortByName(DynamicArray array) {
        if (!isEmptyContainer(array)) {
            InsertionSort.sort(array);
        }
    }

    private static boolean isEmptyContainer(DynamicArray array) {
        return array.isEmpty();
    }
}

class InsertionSort {
    public static Unit[] sort(DynamicArray array) {
        Unit[] units = array.getUnits();
        for (int j = 1; j < array.getSize(); j++) {
            Unit unit = units[j];
            int i = j - 1;

            while (i >= 0 && less(unit.getName(), units[i].getName())) {
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

class BubbleSort implements Sortable {
    public void sort(DynamicArray array) {
        Unit[] units = array.getUnits();
        Unit temp;
        int sortedBorder;
        int unSortedBorder = units.length - 1;
        boolean change = false;
        for (int i = 0; i < unSortedBorder; i++) {
            sortedBorder = units.length - 1 - i;
            for (int j = 0; j < sortedBorder; j++) {
                if (units[j].getDamagePoints() > units[j + 1].getDamagePoints()) {
                    change = true;
                    swap(units[j], units[j + 1]);
                    temp = units[j];
                    units[j] = units[j + 1];
                    units[j + 1] = temp;
                }
            }
            if (!change) {
                return;
            }
        }
    }

    @Override
    public void swap(Unit unit1, Unit unit2) {
        Unit temp = unit1;
        unit1 = unit2;
        unit2 = temp;
    }
}


