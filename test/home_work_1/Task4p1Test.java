package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4p1Test {

    @Test
    public void oddOrEven() {
        Task4p1 task4p1 = new Task4p1();
        Assertions.assertEquals("Число четное", task4p1.oddOrEven(8));
    }

    @Test
    public void oddOrEven2() {
        Task4p1 task4p1 = new Task4p1();
        Assertions.assertEquals("Число нечетное", task4p1.oddOrEven(9));
    }

    @Test
    public void oddOrEven3() {
        Task4p1 task4p1 = new Task4p1();
        Assertions.assertEquals("Число четное", task4p1.oddOrEven(0));
    }

    @Test
    public void oddOrEven4() {
        Task4p1 task4p1 = new Task4p1();
        Assertions.assertEquals("Число четное", task4p1.oddOrEven(-156));
    }

    @Test
    public void oddOrEven5() {
        Task4p1 task4p1 = new Task4p1();
        Assertions.assertEquals("Число нечетное", task4p1.oddOrEven(-777));
    }
}
