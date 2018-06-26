package by.stepovoy.task07.logic.search;

import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;

public class LinearSearch extends Searcher {
    @Override
    public Unit search(AbstractContainer array) {
            return searchLinear(array);
    }

    public Unit searchLinear(AbstractContainer array) {
            Unit[] units = array.getUnits();
            Unit mostDamagable = units[0];
            for (int i = 0; i < array.getCurrentSize(); i++) {
                if (mostDamagable.getDamagePoints() < units[i].getDamagePoints()) {
                    mostDamagable = units[i];
                }
            }
            return mostDamagable;
    }

}
