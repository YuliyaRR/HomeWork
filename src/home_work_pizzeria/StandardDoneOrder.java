package home_work_pizzeria;

import home_work_pizzeria.api.*;
import java.util.ArrayList;
import java.util.List;

public class StandardDoneOrder implements IDoneOrder {
    private ITicket ticket;
    private List<IPizza> item = new ArrayList<>();

    public StandardDoneOrder(ITicket ticket) {
        this.ticket = ticket;
        IOrder order = ticket.getOrder();
        for (ISelectedItem selectedItem: order.getSelected()) {
            int count = 0;
            while(count < selectedItem.getCount()){
                IPizza pizza = new Pizza(selectedItem.getRow().getInfo());
                item.add(pizza);
                count++;
            }
        }
        //Pizzeria.addDoneOrder(ticket, this);
    }

    @Override
    public List<IPizza> getItem() {
        return this.item;
    }

    @Override
    public ITicket getTicket() {
        return this.ticket;
    }

    @Override
    public String toString() {
        return "Готовый заказа по квитку №" + ticket.getNumber() +
                ". \nСостав заказа:\n" + item;
    }
}
