package home_work_pizzeria;

import home_work_pizzeria.api.IMenuRow;
import home_work_pizzeria.api.IPizzaInfo;

public class StandardMenuRow implements IMenuRow {
    private IPizzaInfo info;
    private double price;

    public StandardMenuRow(IPizzaInfo info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return this.info;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return info + ". Цена: " + price;
    }
}
