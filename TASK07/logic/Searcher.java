package by.stepovoy.task07.logic;

import by.stepovoy.task07.exception.EmptyContainerException;
import by.stepovoy.task07.exception.OutOfRangeException;
import by.stepovoy.task07.model.container.DynamicArray;
import by.stepovoy.task07.model.entities.Unit;


public abstract class Searcher implements Searchable {

    public abstract Unit search(DynamicArray array);

    public boolean isEmptyContainer(DynamicArray array)
            throws EmptyContainerException {
        return array.isEmpty();
    }

    public Unit findMostDamagable(DynamicArray array)
            throws EmptyContainerException {
        if (!isEmptyContainer(array)) {
            return new LinearSearch().search(array);
        } else throw new EmptyContainerException("Container is empty!");
    }

    public int findByName(DynamicArray array, String name)
            throws EmptyContainerException, OutOfRangeException {
        if (!isEmptyContainer(array)) {
            return new BinarySearch().searchBinary(array,name,0,array.getSize()-1);
        } else throw new EmptyContainerException("Container is empty!");
    }
}

class LinearSearch extends Searcher {
    @Override
    public Unit search(DynamicArray array) {
            return searchLinear(array);
    }

    public Unit searchLinear(DynamicArray array) {
            Unit[] units = array.getUnits();
            Unit mostDamagable = units[0];
            for (int i = 0; i < array.getSize(); i++) {
                if (mostDamagable.getDamagePoints() < units[i].getDamagePoints()) {
                    mostDamagable = units[i];
                }
            }
            return mostDamagable;
    }
}

class BinarySearch extends Searcher {
    public int searchBinary(DynamicArray array,String name,int left,int right)
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
    public Unit search(DynamicArray array) {
        return null;
    }
}

