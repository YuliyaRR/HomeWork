package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoChoiceAgregationTest {

    @Test
    public void incrementCountOperation() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void divide() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide16() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide17() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide18() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation16() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation17() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation18() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation19() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation20() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum16() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum17() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum18() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation21() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation22() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree7() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree10() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation23() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree11() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree12() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree13() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree14() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree15() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation24() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation25() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module4() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation26() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation27() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void squareRoot() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation28() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation29() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
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
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot5() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot6() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation30() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation31() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
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
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot8() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot9() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation32() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation33() {
        CalculatorWithCounterAutoChoiceAgregation calc =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
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
