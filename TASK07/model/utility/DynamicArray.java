package by.stepovoy.task07.model.utility;

import by.stepovoy.task07.model.entities.Unit;
import java.util.Arrays;

public class DynamicArray {
    private Unit[] units;
    private int size;

    public DynamicArray() {
        units = new Unit[size];
    }

    public DynamicArray(int size){
        units = new Unit[size];
    }

    public DynamicArray(Unit[] unit) {
        units = Arrays.copyOf(unit, unit.length);
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public Unit[] getUnits() {
        return units;
    }

    public void setUnits(Unit[] units) {
        this.units = units;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            units[i] = null;
        }
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return Arrays.toString(units);
    }
}
