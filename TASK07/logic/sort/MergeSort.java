package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.container.DynamicArray;

public class MergeSort extends Sorter {

    private void mergeSort(AbstractContainer array,
                           int leftBound,
                           int rightBound,
                           AbstractContainer temp)
            throws OutOfRangeException {
        if (leftBound < rightBound) {
            int midIndex = leftBound
                    + (rightBound - leftBound) / 2;

            mergeSort(array, leftBound, midIndex, temp);
            mergeSort(array, midIndex + 1, rightBound, temp);
            merge(array, leftBound, midIndex, rightBound, temp);
        }
    }

    private void merge(AbstractContainer array,
                       int leftIndex,
                       int midIndex,
                       int rightIndex,
                       AbstractContainer temp)
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
    public void sort(AbstractContainer a1) throws OutOfRangeException {
        mergeSort(a1, 0, a1.getCurrentSize() - 1,
                new DynamicArray(a1.getUnits()));
    }
}
