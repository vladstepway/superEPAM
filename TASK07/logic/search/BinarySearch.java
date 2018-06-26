package by.stepovoy.task07.logic.search;

import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;

public class BinarySearch extends Searcher {
    public int searchBinary(AbstractContainer array, String name, int left, int right)
            throws OutOfRangeException {
        if (right>=left)
        {
            int mid = left + (right - left)/2;

            if (name.equals(array.getUnit(mid).getName()))
                return mid;

            if (array.getUnit(mid).getName().compareTo(name)<0)
                return searchBinary(array, name, left,mid-1);

            return searchBinary(array, name,mid+1, right);
        }
        return -1;
    }

    @Override
    public Unit search(AbstractContainer array) {
        return null;
    }
}
