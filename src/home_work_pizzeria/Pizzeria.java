package home_work_pizzeria;

import home_work_pizzeria.api.*;
import java.util.HashMap;
import java.util.Map;

public class Pizzeria implements IPizzeria {
    private static Map<ITicket, IOrderStatus> currentStatus = new HashMap<>();
    private static Map<ITicket, IDoneOrder> doneOrders = new HashMap<>();
    private IMenu menu;

    public Pizzeria(IMenu menu) {
        this.menu = menu;
    }

    public static void addCurrentStatus(ITicket ticket, IOrderStatus orderStatus){
        currentStatus.put(ticket,orderStatus);
    }

    public static void addDoneOrder(ITicket ticket, IDoneOrder doneOrder){
        doneOrders.put(ticket, doneOrder);
    }

    @Override
    public IMenu takeMenu() {
        return this.menu;
    }

    @Override
    public ITicket create(IOrder order) {
        return new Ticket(order);
    }

    @Override
    public IOrderStatus check(ITicket ticket) {
        return currentStatus.get(ticket);
    }

    @Override
    public IDoneOrder pickUp(ITicket ticket) {
        if(doneOrders.containsKey(ticket)) {
            return doneOrders.get(ticket);
        } else {
            return null;
        }
    }
}

