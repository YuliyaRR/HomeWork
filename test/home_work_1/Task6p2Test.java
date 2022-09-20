package home_work_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6p2Test {

    @Test
    public void welcome() {
        Task6p2 task6p2 = new Task6p2();
        Assertions.assertEquals("Привет \n Я тебя так долго ждал", task6p2.welcome("Вася"));

    }

    @Test
    public void welcome1() {
        Task6p2 task6p2 = new Task6p2();
        Assertions.assertEquals("Я тебя так долго ждал", task6p2.welcome("Анастасия"));
    }

    @Test
    public void welcome2() {
        Task6p2 task6p2 = new Task6p2();
        Assertions.assertEquals("Добрый день, а вы кто?", task6p2.welcome("любое"));
    }
}
