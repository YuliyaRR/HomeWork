package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        //4.1 + 15 * 7 + (28 / 5) ^ 2.
        double multiplyRes = calculatorWithMathExtends.multiply(15,7);//105.0
        double devideRes = calculatorWithMathExtends.divide(28,5);//5.6
        double powRes = calculatorWithMathExtends.degree(devideRes, 2);//31.3599....6

        double fourResult = calculatorWithMathExtends.sum(4.1, calculatorWithMathExtends.sum(multiplyRes, powRes));

        System.out.println(fourResult);//140.45999999999998
    }

}
