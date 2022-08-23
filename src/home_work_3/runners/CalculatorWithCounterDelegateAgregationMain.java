package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculatorAgregation =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        //4.1 + 15 * 7 + (28 / 5) ^ 2.

        double multRes = calculatorAgregation.multiply(15,7);
        double divRes = calculatorAgregation.divide(28,5);
        double powRes = calculatorAgregation.degree(divRes,2);
        double eightResult = calculatorAgregation.sum(4.1, calculatorAgregation.sum(multRes,powRes));

        System.out.println(eightResult);//140.45999999999998
        System.out.println(calculatorAgregation.getCountOperation());//5
    }

}
