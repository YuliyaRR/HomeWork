package home_work_pizzeria;

import home_work_pizzeria.api.IOrderStatus;
import home_work_pizzeria.api.IStage;
import home_work_pizzeria.api.ITicket;
import java.util.ArrayList;
import java.util.List;

public class OrderStatus implements IOrderStatus {
    private List<IStage> history = new ArrayList<>();
    private ITicket orderTicket;
    private IStage currentStage;

    public OrderStatus(ITicket orderTicket) {
        this.orderTicket = orderTicket;
        this.currentStage = new StandardStage(orderTicket);
        this.history.add(currentStage);
        Pizzeria.addCurrentStatus(orderTicket, this);
    }

    public OrderStatus(IStage currentStage, ITicket orderTicket) {
        this.currentStage = currentStage;
        this.orderTicket = orderTicket;
        Pizzeria.addCurrentStatus(orderTicket,this);
    }

    @Override
    public List<IStage> getHistory() {
        return this.history;
    }

    @Override
    public boolean isDone() {
        boolean result = false;
        for (IStage iStage : this.history) {
            if(iStage.getDescription().equals("Заказ готов ")){
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public ITicket getTicket() {
        return this.orderTicket;
    }

    @Override
    public String toString() {
        return "Статус заказа по квитку " + orderTicket.getNumber() + ": " + currentStage;
    }
}
