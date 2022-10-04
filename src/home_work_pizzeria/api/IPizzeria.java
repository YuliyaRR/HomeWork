package home_work_pizzeria.api;

/**
 * пиццерия
 */
public interface IPizzeria {

    /**
     * Получить меню
     * @return меню с доступными для заказа пиццами
     */
    IMenu takeMenu();

    /**
     * Оформить заказ
     * @param order заказ
     * @return квиток для отслеживания
     */
    ITicket create(IOrder order);

    /**
     * проверить состояние заказа по квитку
     * @param ticket - квиток, выданный при создании заказа
     * @return - информация о состоянии заказе
     */
    IOrderStatus check(ITicket ticket);

    /**
     * Получить сформированный заказ
     * @param ticket - квиток, выданный при создании заказа
     * @return готовый заказ с тем что мы выбрали
     */
    IDoneOrder pickUp(ITicket ticket);








}
