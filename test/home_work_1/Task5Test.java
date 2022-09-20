package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    public void sleepIn(){
        Assertions.assertFalse(Task5.sleepIn(true, false));
    }

    @Test
    public void sleepIn2(){
        Assertions.assertTrue(Task5.sleepIn(true, true));
    }

    @Test
    public void sleepIn3(){
        Assertions.assertTrue(Task5.sleepIn(false, true));
    }

    @Test
    public void sleepIn4(){
        Assertions.assertTrue(Task5.sleepIn(false, false));
    }
}
