package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTest {

    @Test
    public void getMemory() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(5,calc.getMemory());
    }

    @Test
    public void getMemory3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(),2);
        calc.saveInMemory();
        Assertions.assertEquals(25,calc.getMemory());
    }

    @Test
    public void getMemory5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(5,calc.getMemory());
    }

    @Test
    public void getMemory7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2, 3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(), 2);
        calc.saveInMemory();
        Assertions.assertEquals(25, calc.getMemory());
    }

    @Test
    public void getMemory9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(5,calc.getMemory());
    }

    @Test
    public void getMemory11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2, 3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(), 2);
        calc.saveInMemory();
        Assertions.assertEquals(25, calc.getMemory());
    }

    @Test
    public void incrementCountOperation() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void divide() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide16() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide17() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide18() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation16() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation17() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation18() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation19() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation20() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum16() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum17() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum18() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation21() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation22() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree7() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree10() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation23() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree11() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree12() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree13() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree14() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree15() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation24() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation25() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module4() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation26() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation27() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void squareRoot() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation28() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation29() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
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
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot5() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot6() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation30() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation31() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
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
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot8() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot9() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation32() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation33() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
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
    public void incrementCountOperation34() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation35() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation36() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation37() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation38() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation39() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }






}
