package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        //4.1 + 15 * 7 + (28 / 5.0) ^ 2.
        double multiplyRes = calculatorWithOperator.multiply(15,7);//105.0
        double devideRes = calculatorWithOperator.divide(28,5);//5.6
        double powRes = calculatorWithOperator.degree(devideRes, 2);//31.35999999...6

        double twoResult = calculatorWithOperator.sum(4.1, calculatorWithOperator.sum(multiplyRes,powRes));//

        System.out.println(twoResult);//140.45999999999998
    }
}
