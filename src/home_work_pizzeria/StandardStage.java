package home_work_pizzeria;

import home_work_pizzeria.api.IOrderStatus;
import home_work_pizzeria.api.IStage;
import home_work_pizzeria.api.ITicket;
import java.time.LocalTime;

public class StandardStage implements IStage {
    private final String[] stage = {"Заказ принят ", "Заказ готовится ", "Заказ в печи ", "Заказ упаковывается ", "Заказ готов "};

    private String description;
    private LocalTime startStage;

    public StandardStage(ITicket ticket) {
        this.description = stage[0];
        this.startStage = ticket.getCreateAt().toLocalTime();
    }

    public StandardStage(IOrderStatus status) {
        int currentSizeHistoryOrder = status.getHistory().size();
        this.description = stage[currentSizeHistoryOrder];
        this.startStage = LocalTime.now();
        IOrderStatus statusNext = new OrderStatus(this, status.getTicket());
        status.getHistory().add(this);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public LocalTime time() {
        return this.startStage;
    }

    @Override
    public String toString() {
        return description + startStage;
    }
}
