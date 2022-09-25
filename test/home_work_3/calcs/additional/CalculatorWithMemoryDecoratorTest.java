package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryDecoratorTest {

    @Test
    public void getMemory() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory2() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
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
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(),2);
        calc.saveInMemory();
        Assertions.assertEquals(25,calc.getMemory());
    }

    @Test
    public void getMemory5() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory6() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(5,calc.getMemory());
    }

    @Test
    public void getMemory7() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory8() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2, 3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(), 2);
        calc.saveInMemory();
        Assertions.assertEquals(25, calc.getMemory());
    }

    @Test
    public void getMemory9() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
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
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.sum(2,3);
        Assertions.assertEquals(0,calc.getMemory());
    }

    @Test
    public void getMemory12() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.sum(2, 3);
        calc.saveInMemory();
        calc.degree(calc.getMemory(), 2);
        calc.saveInMemory();
        Assertions.assertEquals(25, calc.getMemory());
    }

    @Test
    public void incrementCountOperation() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation2() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation3() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation4() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation5() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation6() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation7() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation() );
    }

    @Test
    public void incrementCountOperation8() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation9() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(4, calc.getCountOperation() );
    }

    @Test
    public void divide() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
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
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide10() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide11() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide12() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation11() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void divide13() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3.0, calc.divide(6,2));
    }

    @Test
    public void divide14() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.divide(0,2));
    }

    @Test
    public void divide15() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-3, calc.divide(-6,2));
    }

    @Test
    public void divide16() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.divide(-6,-2));
    }

    @Test
    public void divide17() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(5.6, calc.divide(28,5));
    }

    @Test
    public void divide18() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Throwable throwable = Assertions.assertThrows (ArithmeticException.class,
                () -> calc.divide(28,0));
        Assertions.assertEquals("На ноль делить нельзя", throwable.getMessage());
    }

    @Test
    public void incrementCountOperation12() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.divide(6,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation13() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply7() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply10() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation14() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.multiply(15,7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void multiply11() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(12, calc.multiply(6,2));
    }

    @Test
    public void multiply12() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-12, calc.multiply(-6,2));
    }

    @Test
    public void multiply13() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(15.5, calc.multiply(-6.2,-2.5));
    }

    @Test
    public void multiply14() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.multiply(0,2.5));
    }

    @Test
    public void multiply15() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(105, calc.multiply(15,7));
    }

    @Test
    public void incrementCountOperation15() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.multiply(15, 7);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation16() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus7() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus10() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation17() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void minus11() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.minus(3,2));
    }

    @Test
    public void minus12() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-2, calc.minus(0,2));
    }

    @Test
    public void minus13() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-1, calc.minus(-3,-2));
    }

    @Test
    public void minus14() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(2, calc.minus(2,0));
    }

    @Test
    public void minus15() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.minus(2,2));
    }

    @Test
    public void incrementCountOperation18() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.minus(2,2);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation19() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum7() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum10() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum11() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum12() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation20() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void sum13() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(4, calc.sum(2,2));
    }

    @Test
    public void sum14() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.sum(2,-2));
    }

    @Test
    public void sum15() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-5, calc.sum(-3,-2));
    }

    @Test
    public void sum16() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.sum(3,0));
    }

    @Test
    public void sum17() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(136.359999999999996, calc.sum(105,31.359999999999996));
    }

    @Test
    public void sum18() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(140.45999999999998, calc.sum(4.1,136.359999999999996));
    }

    @Test
    public void incrementCountOperation21() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.sum(3,0);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation22() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree7() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree10() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation23() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void degree11() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(1, calc.degree(6,0));
    }

    @Test
    public void degree12() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(36, calc.degree(6,2));
    }

    @Test
    public void degree13() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(9, calc.degree(-3,2));
    }

    @Test
    public void degree14() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(-27, calc.degree(-3,3));
    }

    @Test
    public void degree15() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(31.359999999999996, calc.degree(5.6,2));
    }

    @Test
    public void incrementCountOperation24() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.degree(-3,3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation25() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module4() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation26() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void module5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(-3));
    }

    @Test
    public void module6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.module(3));
    }

    @Test
    public void incrementCountOperation27() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.module(3);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void squareRoot() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot2() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot3() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation28() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation29() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
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
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot5() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot6() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation30() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation31() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
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
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(3, calc.squareRoot(9));
    }

    @Test
    public void squareRoot8() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0,calc.squareRoot(0));
    }

    @Test
    public void squareRoot9() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(0.5,calc.squareRoot(0.25));
    }

    @Test
    public void incrementCountOperation32() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.squareRoot(9);
        Assertions.assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation33() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
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
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation35() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation36() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation37() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation38() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.sum(2,3);
        calc.saveInMemory();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void incrementCountOperation39() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.sum(2,3);
        calc.saveInMemory();
        calc.getMemory();
        Assertions.assertEquals(3, calc.getCountOperation());
    }
}
