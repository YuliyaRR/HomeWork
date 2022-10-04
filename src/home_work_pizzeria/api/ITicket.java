package home_work_pizzeria.api;

import java.time.LocalDateTime;

/**
 * Квиток, выданный к заказу
 */
public interface ITicket {
    /**
     * Уникальный номер заказа
     * @return
     */
    String getNumber();

    /**
     * Когда заказ получен
     * @return
     */
    LocalDateTime getCreateAt();

    /**
     * Заказ, для которого выдали квиток
     * @return
     */
    IOrder getOrder();



}
