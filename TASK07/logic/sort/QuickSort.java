package by.stepovoy.task07.logic.sort;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;

public class QuickSort extends Sorter {

    @Override
    public void sort(AbstractContainer array) throws OutOfRangeException {
        quickSort(array, 0, array.getCurrentSize() - 1);
    }

    private void quickSort(AbstractContainer array,
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
