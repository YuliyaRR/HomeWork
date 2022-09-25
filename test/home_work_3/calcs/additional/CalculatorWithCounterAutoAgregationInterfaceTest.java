package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationInterfaceTest {

    @Test
    public void incrementCountOperation() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void divide() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide16() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide17() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide18() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation16() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation17() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation18() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation19() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation20() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum16() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum17() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum18() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation21() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation22() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree10() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation23() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree11() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree12() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree13() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree14() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree15() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation24() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation25() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation26() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation27() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void squareRoot() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation28() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation29() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        calc.minus(2,1);
        calc.multiply(6,3);
        calc.module(-6);
        calc.squareRoot(36);
        calc.sum(36, 11);
        calc.divide(25,5);
        calc.degree(5,2);
        Assertions.assertEquals(7, calc.getCountOperation() );
    }

    @Test
    public void squareRoot4() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot5() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot6() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation30() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation31() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        calc.minus(2,1);
        calc.multiply(6,3);
        calc.module(-6);
        calc.squareRoot(36);
        calc.sum(36, 11);
        calc.divide(25,5);
        calc.degree(5,2);
        Assertions.assertEquals(7, calc.getCountOperation() );
    }

    @Test
    public void squareRoot7() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot8() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot9() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation32() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation33() {
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
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
