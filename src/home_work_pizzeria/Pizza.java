package home_work_pizzeria;

import home_work_pizzeria.api.IPizza;
import home_work_pizzeria.api.IPizzaInfo;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza(IPizzaInfo info) {
        this.name = info.getName();
        this.size = info.getSize();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Пицца " + name + " - размер " + size;
    }
}
