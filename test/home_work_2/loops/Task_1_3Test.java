package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_3Test {
    @Test
    public void exponentiate() {
        Assertions.assertEquals(3375, Task_1_3.exponentiate(15,3));
    }

    @Test
    public void exponentiate2() {
        Assertions.assertEquals(1_889_568, Task_1_3.exponentiate(18,5));
    }

    @Test
    public void exponentiate3() {
        Assertions.assertEquals(56.25, Task_1_3.exponentiate(7.5,2));
    }

    @Test
    public void exponentiate4() {
        Assertions.assertEquals(-8, Task_1_3.exponentiate(-2,3));
    }

    @Test
    public void exponentiate5() {
        Assertions.assertEquals(16, Task_1_3.exponentiate(2,4));
    }

    @Test
    public void exponentiate6() {
        Assertions.assertEquals(1, Task_1_3.exponentiate(2457,0));
    }

    @Test
    public void exponentiate7() {
        Assertions.assertEquals(1, Task_1_3.exponentiate(-2457,0));
    }

    @Test
    public void sampleView(){
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", Task_1_3.sampleView(18,5));
    }

    @Test
    public void sampleView2(){
        Assertions.assertEquals("7.5 ^ 2 = 56.25", Task_1_3.sampleView(7.5,2));
    }

    @Test
    public void sampleView3(){
        Assertions.assertEquals("-2457.0 ^ 0 = 1.0", Task_1_3.sampleView(-2457,0));
    }

    @Test
    public void sampleView4(){
        Assertions.assertEquals("-2.0 ^ 3 = -8.0", Task_1_3.sampleView(-2,3));
    }
}
