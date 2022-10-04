package home_work_pizzeria.api;

import java.util.List;

/**
 * Статус заказа, выданного по определенному квитку
 */
public interface IOrderStatus {

    /**
     * Получить список пройденных этапов
     * @return пройденные этапы заказа
     */
    List<IStage> getHistory();

    /**
     * признак готовности заказа
     * @return true - готов, false - не готов
     */
    boolean isDone();

    /**
     * По какому квитку получили заказ
     * @return
     */
    ITicket getTicket();



}
