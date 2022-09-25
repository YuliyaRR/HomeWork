package home_work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoCompositeTest {

    @Test
    public void incrementCountOperation() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void divide() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
    }

    @Test
    public void divide3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide6() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation6() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation7() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation8() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation9() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void squareRoot() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation10() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation11() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.minus(2,1);
        calc.multiply(6,3);
        calc.module(-6);
        calc.squareRoot(36);
        calc.sum(36, 11);
        calc.divide(25,5);
        calc.degree(5,2);
        Assertions.assertEquals(7, calc.getCountOperation() );
    }
}
