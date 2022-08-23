package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper =
                new CalculatorWithCounterAutoSuper();

        //4.1 + 15 * 7 + (28 / 5) ^ 2.

        double multRes = calculatorWithCounterAutoSuper.multiply(15,7);//105.0
        double divRes = calculatorWithCounterAutoSuper.divide(28, 5);//5.6
        double powRes = calculatorWithCounterAutoSuper.degree(divRes, 2);//31.3599...6
        double sixResult = calculatorWithCounterAutoSuper.sum(4.1, calculatorWithCounterAutoSuper.sum(multRes, powRes));

        System.out.println(sixResult);//140.45999999999998
        System.out.println(calculatorWithCounterAutoSuper.getCountOperation());//5
    }
}
