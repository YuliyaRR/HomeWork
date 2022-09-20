package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1_2Test {
    @Test
    public void checkData(){
        Assertions.assertTrue(Task_1_1_2.checkData(1));
    }

    @Test
    public void checkData1(){
        Assertions.assertFalse(Task_1_1_2.checkData(0));
    }

    @Test
    public void checkData2(){
        Assertions.assertFalse(Task_1_1_2.checkData(-1));
    }

    @Test
    public void checkOverflowInt(){
        Assertions.assertTrue(Task_1_1_2.checkOverflowInt(2_147_483_648L));
    }

    @Test
    public void checkOverflowInt2(){
        Assertions.assertFalse(Task_1_1_2.checkOverflowInt(2_147_483_647L));
    }

    @Test
    public void checkOverflowInt3(){
        Assertions.assertTrue(Task_1_1_2.checkOverflowInt(3_000_000_000L));
    }

    @Test
    public void checkOverflowInt4(){
        Assertions.assertFalse(Task_1_1_2.checkOverflowInt(15L));
    }

    @Test
    public void checkOverflowInt5(){
        Assertions.assertTrue(Task_1_1_2.checkOverflowInt(0L));
    }

    @Test
    public void checkOverflowInt6(){
        Assertions.assertTrue(Task_1_1_2.checkOverflowInt(-157489L));
    }

    @Test
    public void factorial(){
        Assertions.assertEquals(6, Task_1_1_2.factorial(3));
    }

    @Test
    public void factorial2(){
        Assertions.assertEquals(1_307_674_368_000L, Task_1_1_2.factorial(15));
    }

    @Test
    public void factorial3(){
        Assertions.assertEquals(120, Task_1_1_2.factorial(5));
    }

    @Test
    public void factorial4(){
        Assertions.assertEquals(40320, Task_1_1_2.factorial(8));
    }

    @Test
    public void factorial5(){
        Assertions.assertEquals(-5_968_160_532_966_932_480L, Task_1_1_2.factorial(28));
    }

    @Test
    public void makeSample(){
        Assertions.assertEquals("Некорректные данные", Task_1_1_2.makeSample("0"));
    }

    @Test
    public void makeSample2(){
        Assertions.assertEquals("Некорректные данные", Task_1_1_2.makeSample("-6"));
    }

    @Test
    public void makeSample3(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 " +
                "= Переполнение! Слишком большое число!", Task_1_1_2.makeSample("15"));
    }

    @Test
    public void makeSample4(){
        Assertions.assertEquals("1 * 2 * 3 = 6", Task_1_1_2.makeSample("3"));
    }

    @Test
    public void makeSample5(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", Task_1_1_2.makeSample("5"));
    }

    @Test
    public void makeSample6(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = 40320", Task_1_1_2.makeSample("8"));
    }





}
