package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTest {
    @Test
    public void getMemory() {
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calcMemory.sum(2,3);
        calcMemory.saveInMemory();
        Assertions.assertEquals(5,calcMemory.getMemory());
    }

    @Test
    public void getMemory2() {
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calcMemory.sum(2,3);
        Assertions.assertEquals(0,calcMemory.getMemory());
    }

    @Test
    public void getMemory3() {
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calcMemory.sum(2,3);
        calcMemory.saveInMemory();
        calcMemory.degree(calcMemory.getMemory(),2);
        calcMemory.saveInMemory();
        Assertions.assertEquals(25,calcMemory.getMemory());
    }


}
