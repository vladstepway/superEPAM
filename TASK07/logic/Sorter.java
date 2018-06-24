package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;


public abstract class Sorter implements Sortable {
    public void sortByName(DynamicArray array)
            throws EmptyContainerException, OutOfRangeException {
        if (!isEmptyContainer(array)) {
            new InsertionSort().sort(array);
        }
    }

    @Override
    public boolean isEmptyContainer(DynamicArray array)
            throws EmptyContainerException {
        return array.isEmpty();
    }



    public abstract void sort(DynamicArray array)
            throws OutOfRangeException;

    @Override
    public void swap(Unit unit1, Unit unit2) {
        Unit tmp = unit1;
        unit1 = unit2;
        unit2 = tmp;
    }
}

class InsertionSort extends Sorter {
    @Override
    public void sort(DynamicArray array) throws OutOfRangeException {
        for (int i = 1; i < array.getSize(); i++) {
            for (int j = i; j > 0; j--) {
                if (array.getUnit(j).getHealthPoints()
                        < array.getUnit(j - 1).getHealthPoints()) {
                    swap(array.getUnit(j), array.getUnit(j - 1));
                }
            }
        }

    }
}

class BubbleSort extends Sorter {
    @Override
    public void sort(DynamicArray array) throws OutOfRangeException {
        boolean change = false;
        while (!change) {
            change = true;
            for (int j = 0; j < array.getSize() - 1; j++) {
                if (array.getUnit(j).getDamagePoints()
                        > array.getUnit(j + 1).getDamagePoints()) {
                    change = false;
                    swap(array.getUnit(j), array.getUnit(j + 1));
                }
            }
        }
    }

}

class SelectionSort extends Sorter {

    @Override
    public void sort(DynamicArray array) throws OutOfRangeException {
        for (int i = 0; i < array.getSize() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.getSize(); j++)
                if (array.getUnit(j).getDamagePoints()
                        < array.getUnit(index).getDamagePoints())
                    index = j;
            swap(array.getUnit(index), array.getUnit(i));
        }
    }
}

class MergeSort extends Sorter {


    public void mergeSort(DynamicArray array,
                          int leftBound,
                          int rightBound,
                          DynamicArray temp)
            throws OutOfRangeException {
        if (leftBound < rightBound) {
            int midIndex = leftBound
                    + (rightBound - leftBound) / 2;

            mergeSort(array, leftBound, midIndex, temp);
            mergeSort(array, midIndex + 1, rightBound, temp);
            merge(array, leftBound, midIndex, rightBound, temp);
        }
    }

    private void merge(DynamicArray array,
                       int leftIndex,
                       int midIndex,
                       int rightIndex,
                       DynamicArray temp)
            throws OutOfRangeException {
        int left = leftIndex;
        int right = midIndex + 1;
        for (int i = leftIndex; i <= rightIndex; i++) {
            temp.setUnit(i, array.getUnit(i));
        }
        while (left <= midIndex && right <= rightIndex) {
            array.setUnit(leftIndex++,
                    temp.getUnit(left).getDamagePoints()
                            > temp.getUnit(right).getDamagePoints()
                            ? temp.getUnit(left++)
                            : temp.getUnit(right++));
        }
        while (left <= midIndex) {
            array.setUnit(leftIndex++, temp.getUnit(left++));
        }
    }

    @Override
    public void sort(DynamicArray array)
            throws OutOfRangeException {
        mergeSort(array, 0, array.getSize() - 1,
                new DynamicArray(array.getUnits()));

    }
}

class QuickSort extends Sorter {

    @Override
    public void sort(DynamicArray array) throws OutOfRangeException {
        quickSort(array, 0, array.getSize() - 1);
    }

    private void quickSort(DynamicArray array,
                           int leftBound,
                           int rightBound)
            throws OutOfRangeException {
        int left = leftBound;
        int right = rightBound;
        Unit temp = array.getUnit(leftBound + (rightBound - leftBound) / 2);

        while (left <= right) {

            while (array.getUnit(left).getDamagePoints()
                    > temp.getDamagePoints()) {
                left++;
            }

            while (array.getUnit(right).getDamagePoints() < temp.getDamagePoints()) {
                right--;
            }

            if (left <= right) {
                swap(array.getUnit(left++), array.getUnit(right--));
            }
        }

        if (leftBound < right) {
            quickSort(array, leftBound, right);
        }

        if (left < rightBound) {
            quickSort(array, left, rightBound);
        }
    }
}
