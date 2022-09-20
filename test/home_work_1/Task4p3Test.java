package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4p3Test {

    @Test
    public void divisibilityCheck(){
        Task4p3 task4p3 = new Task4p3();
        Assertions.assertEquals("На ноль делить нельзя!!",task4p3.divisibilityCheck(15,0));

    }

    @Test
    public void divisibilityCheck2(){
        Task4p3 task4p3 = new Task4p3();
        Assertions.assertEquals("Число 15 делится без остатка на число 3",task4p3.divisibilityCheck(15,3));
    }

    @Test
    public void divisibilityCheck3(){
        Task4p3 task4p3 = new Task4p3();
        Assertions.assertEquals("Число -5 делится на число 3 с остатком",task4p3.divisibilityCheck(-5,3));
    }


}
