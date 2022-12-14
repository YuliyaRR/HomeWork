package home_work_2.loops;

import home_work_1.Task4p4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2Test {
    @Test
    public void dataValidation() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> Task_1_2.dataValidation("1.2.3"));
        assertEquals("Введено не число", thrown.getMessage());
    }

    @Test
    public void dataValidation2() throws IllegalArgumentException {
            Throwable thrown = assertThrows(IllegalArgumentException.class,
                    () -> Task_1_2.dataValidation("12.3"));
            assertEquals("Введено дробное число", thrown.getMessage());
    }

    @Test
    public void dataValidation3() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> Task_1_2.dataValidation("hello123"));
        assertEquals("Введено не число", thrown.getMessage());
    }

    @Test
    public void dataValidation4() {
        Assertions.assertTrue(Task_1_2.dataValidation("123"));
    }

    @Test
    public void dataValidation5() {
        Assertions.assertTrue(Task_1_2.dataValidation("0"));
    }

    @Test
    public void multiplicationOfAllDigits(){
        Assertions.assertEquals(40, Task_1_2.multiplicationOfAllDigits(1452));
    }

    @Test
    public void multiplicationOfAllDigits2(){
        Assertions.assertEquals(10_080, Task_1_2.multiplicationOfAllDigits(181232375));
    }

    @Test
    public void multiplicationOfAllDigits3(){
        Assertions.assertEquals(0, Task_1_2.multiplicationOfAllDigits(1001));
    }

    @Test
    public void sampleView(){
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080",
                Task_1_2.sampleView("181232375"));
    }

    @Test
    public void sampleView2(){
        Assertions.assertEquals("1 * 4 * 5 * 2 = 40", Task_1_2.sampleView("1452"));
    }

    @Test
    public void sampleView3(){
        Assertions.assertEquals("1 * 0 * 0 * 1 = 0", Task_1_2.sampleView("1001"));
    }
}
