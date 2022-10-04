package home_work_pizzeria;

import home_work_pizzeria.api.IOrder;
import home_work_pizzeria.api.ISelectedItem;
import java.util.ArrayList;
import java.util.List;

public class StandardOrder implements IOrder {

    private List<ISelectedItem> order;

    public StandardOrder() {
        this.order = new ArrayList<>();
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return this.order;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        double sum = 0;
        stb.append("Стандартный заказ: ").append("\n");
        int i = 1;
        for (ISelectedItem iSelectedItem : order) {
            stb.append(i++).append(". ").append(iSelectedItem).append("\n");
            sum += iSelectedItem.getCount() * iSelectedItem.getRow().getPrice();
        }
        stb.append("Итого стоимость заказа: ").append(sum);
        return stb.toString();
    }
}
