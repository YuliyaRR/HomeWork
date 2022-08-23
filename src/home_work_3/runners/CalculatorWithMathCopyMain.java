package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        //4.1 + 15 * 7 + (28 / 5) ^ 2.
        double multiplyRes = calculatorWithMathCopy.multiply(15,7);//105.0
        double devideRes = calculatorWithMathCopy.divide(28,5);//5.6
        double powRes = calculatorWithMathCopy.degree(devideRes, 2);//31.35999...6

        double threeResult = calculatorWithMathCopy.sum(4.1, calculatorWithMathCopy.sum(multiplyRes,powRes));//134.1

        System.out.println(threeResult);//140.45999999999998
    }
}
