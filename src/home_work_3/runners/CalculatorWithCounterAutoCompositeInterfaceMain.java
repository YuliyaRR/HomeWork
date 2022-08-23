package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calcInterface =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        //4.1 + 15 * 7 + (28 / 5) ^ 2.

        double multRes = calcInterface.multiply(15,7);
        double divRes = calcInterface.divide(28,5);
        double powRes = calcInterface.degree(divRes,2);
        double twelveRes = calcInterface.sum(4.1, calcInterface.sum(multRes, powRes));

        System.out.println(twelveRes);
        System.out.println(calcInterface.getCountOperation());
    }
}
