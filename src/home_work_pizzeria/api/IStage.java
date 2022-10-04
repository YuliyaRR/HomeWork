package home_work_pizzeria.api;

import java.time.LocalTime;

/**
 * Описание этапа выполнения заказа
 */
public interface IStage {
    /**
     * Описание этапа
     * @return
     */
    String getDescription();

    /**
     * когда этап был начат
     * @return
     */
    LocalTime time();



}
