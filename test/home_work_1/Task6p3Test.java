package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6p3Test {

    @Test
    public void welcome() {
        Task6p3 task6p3 = new Task6p3();
        Assertions.assertEquals("Привет \n Я тебя так долго ждал", task6p3.welcome("Вася"));

    }

    @Test
    public void welcome1() {
        Task6p3 task6p3 = new Task6p3();
        Assertions.assertEquals("Я тебя так долго ждал", task6p3.welcome("Анастасия"));
    }

    @Test
    public void welcome2() {
        Task6p3 task6p3 = new Task6p3();
        Assertions.assertEquals("Добрый день, а вы кто?", task6p3.welcome("любое"));
    }
}
