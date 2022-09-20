package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4p6Test {

    @Test
    public void checkLeapYear() {
        Assertions.assertFalse(Task4p6.checkLeapYear(1933));
    }

    @Test
    public void checkLeapYear2() {
        Assertions.assertFalse(Task4p6.checkLeapYear(2100));
    }

    @Test
    public void checkLeapYear3() {
        Assertions.assertFalse(Task4p6.checkLeapYear(1800));
    }

    @Test
    public void checkLeapYear4() {
        Assertions.assertTrue(Task4p6.checkLeapYear(2008));
    }

    @Test
    public void checkLeapYear5() {
        Assertions.assertTrue(Task4p6.checkLeapYear(2000));
    }
}
