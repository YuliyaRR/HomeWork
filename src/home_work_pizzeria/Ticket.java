package home_work_pizzeria;

import home_work_collections.generator.GeneratorRandomEngNumString;
import home_work_pizzeria.api.IOrder;
import home_work_pizzeria.api.ITicket;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket implements ITicket {
    private String numberTicket;
    private LocalDateTime creationTime;
    private IOrder ticketOrder;

    public Ticket(IOrder order) {
        this.ticketOrder = order;
        this.numberTicket = new GeneratorRandomEngNumString(5).generateString();
        this.creationTime = LocalDateTime.now();
    }

    @Override
    public String getNumber() {
        return this.numberTicket;
    }

    @Override
    public LocalDateTime getCreateAt() {
        return this.creationTime;
    }

    @Override
    public IOrder getOrder() {
        return this.ticketOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(numberTicket, ticket.numberTicket) && Objects.equals(creationTime, ticket.creationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberTicket, creationTime);
    }

    @Override
    public String toString() {
        return "Квиток к заказу №" + numberTicket +
                ". \nВремя создания заказа: " + creationTime +
                ". \n" + ticketOrder;
    }
}
