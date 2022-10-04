package home_work_pizzeria.api;

import java.util.List;

/**
 * Готовый заказ
 */
public interface IDoneOrder {

    /**
     * Готовые пиццы, приготовленные по заказу
     * @return список пицц
     */
    List<IPizza> getItem();//готовая пицца

    /**
     * Квиток, по которому готовилась пицца
     * @return квиток, выданный при формировании заказа
     */
    ITicket getTicket();

}
