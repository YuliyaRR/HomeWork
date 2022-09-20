package home_work_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6p1Test {

    @Test
    public void welcome() {
        Task6p1 task6p1 = new Task6p1();
        Assertions.assertEquals("Привет \n Я тебя так долго ждал", task6p1.welcome("Вася"));
    }

    @Test
    public void welcome1() {
        Task6p1 task6p1 = new Task6p1();
        Assertions.assertEquals("Я тебя так долго ждал", task6p1.welcome("Анастасия"));
    }

    @Test
    public void welcome2() {
        Task6p1 task6p1 = new Task6p1();
        Assertions.assertEquals("Добрый день, а вы кто?", task6p1.welcome("любое"));
    }
}
