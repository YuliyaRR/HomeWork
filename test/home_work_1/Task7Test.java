package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    public void checkRightNumber() {
        Assertions.assertTrue(Task7.checkRightNumber(0));
    }

    @Test
    public void checkRightNumber2() {
        Assertions.assertTrue(Task7.checkRightNumber(9));
    }

    @Test
    public void checkRightNumber3() {
        Assertions.assertTrue(Task7.checkRightNumber(5));
    }

    @Test
    public void checkRightNumber4() {
        Assertions.assertFalse(Task7.checkRightNumber(-1));
    }

    @Test
    public void checkRightNumber5() {
        Assertions.assertFalse(Task7.checkRightNumber(10));
    }

    @Test
    public void createPhoneNumber() {
        Assertions.assertEquals("(321) 456-7890", Task7.createPhoneNumber(new int[]{3,2,1,4,5,6,7,8,9,0}));
    }

    @Test
    public void createPhoneNumber2() {
        Assertions.assertEquals("(000) 000-0000", Task7.createPhoneNumber(new int[]{0,0,0,0,0,0,0,0,0,0}));
    }
}
