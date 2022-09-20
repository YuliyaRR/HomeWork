package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    @Test
    public void divide() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void multiply() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void minus() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void sum() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void degree() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void module() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void squareRoot() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        ICalculator calc = new CalculatorWithOperator();
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }
}
