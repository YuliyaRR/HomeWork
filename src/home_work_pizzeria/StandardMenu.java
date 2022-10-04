package home_work_pizzeria;

import home_work_pizzeria.api.IMenu;
import home_work_pizzeria.api.IMenuRow;
import java.util.ArrayList;
import java.util.List;

public class StandardMenu implements IMenu {
    private List<IMenuRow>items;

    public StandardMenu() {
        this.items = new ArrayList<>();
    }

    public void addToStandardMenu(IMenuRow standardMenuRow) {
        items.add(standardMenuRow);
    }

    @Override
    public List<IMenuRow> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        int row = 1;
        stb.append("Стандартное меню:").append("\n");
        for (IMenuRow item : items) {
            stb.append(row++).append(". ").append(item).append("\n");
        }
        return stb.toString();
    }
}
