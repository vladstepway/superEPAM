package by.stepovoy.task07.logic.search;

import by.stepovoy.task07.logic.functions.Logicable;
import by.stepovoy.task07.model.container.AbstractContainer;
import by.stepovoy.task07.model.entities.Unit;

public interface Searchable extends Logicable {
    Unit search(AbstractContainer array);
}
