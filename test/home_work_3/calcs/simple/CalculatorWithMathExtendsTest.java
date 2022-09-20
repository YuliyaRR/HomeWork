package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {
    @Test
    public void degree() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void module() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void squareRoot() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        ICalculator calc = new CalculatorWithMathExtends();
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }
}
