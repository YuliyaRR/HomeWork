package home_work_pizzeria;

import home_work_pizzeria.api.IPizzaInfo;

public class StandardPizzaInfo implements IPizzaInfo {
    private String name;
    private String description;
    private int size;

    public StandardPizzaInfo(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Название пиццы: " + name +
                ". Состав пиццы: " + description +
                ". Размер пиццы: " + size;
    }
}
