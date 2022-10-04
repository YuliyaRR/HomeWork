package home_work_pizzeria.api;

/**
 * Строчка меню
 */
public interface IMenuRow {

    IPizzaInfo getInfo();//информация о пицце

    double getPrice(); //стоимость пиццы
}
