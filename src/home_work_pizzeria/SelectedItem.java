package home_work_pizzeria;

import home_work_pizzeria.api.IMenuRow;
import home_work_pizzeria.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {
    private IMenuRow item;
    private int count;

    protected SelectedItem(IMenuRow item, int count) {
        this.item = item;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return this.item;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return item.getInfo().getName() + ". Размер: " + item.getInfo().getSize() +
                ". Количество: " + count + ". Цена за единицу: " + item.getPrice() +
                ". Итого стоимость: " + item.getPrice()*count;
    }
}
