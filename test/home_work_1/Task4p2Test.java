package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4p2Test {

    @Test
    public void average() {
        Task4p2 task4p2 = new Task4p2();
        Assertions.assertEquals("Среднее число a = 2", task4p2.averageNumber(2,1,3));
    }

    @Test
    public void average2() {
        Task4p2 task4p2 = new Task4p2();
        Assertions.assertEquals("Среднее число b = 6", task4p2.averageNumber(-18,6,25));
    }

    @Test
    public void average3() {
        Task4p2 task4p2 = new Task4p2();
        Assertions.assertEquals("Среднее число c = 0", task4p2.averageNumber(-3,2,0));
    }

    @Test
    public void average4() {
        Task4p2 task4p2 = new Task4p2();
        Assertions.assertEquals("Все введенные числа равны!", task4p2.averageNumber(2,2,2));
    }

    @Test
    public void average5() {
        Task4p2 task4p2 = new Task4p2();
        Assertions.assertEquals("Введено два одинаковых числа! Определить среднее из них невозможно!", task4p2.averageNumber(2,2,0));
    }

}
