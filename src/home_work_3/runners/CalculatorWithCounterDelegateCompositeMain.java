package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite =
                new CalculatorWithCounterAutoComposite();

        //4.1 + 15 * 7 + (28 / 5) ^ 2.

        double multRes = calculatorWithCounterAutoComposite.multiply(15,7);
        double divRes = calculatorWithCounterAutoComposite.divide(28,5);
        double powRes = calculatorWithCounterAutoComposite.degree(divRes,2);
        double sevenResult = calculatorWithCounterAutoComposite.sum(4.1, calculatorWithCounterAutoComposite.sum(multRes, powRes));

        System.out.println(sevenResult);//140.45999999999998
        System.out.println(calculatorWithCounterAutoComposite.getCountOperation());//5
    }
}
