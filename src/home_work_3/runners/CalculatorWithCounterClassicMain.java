package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();

        //4.1 + 15 * 7 + (28 / 5) ^ 2.
        double multiplyRes = calculatorWithCounterClassic.multiply(15,7);//105.0
        calculatorWithCounterClassic.incrementCountOperation();//1

        double devideRes = calculatorWithCounterClassic.divide(28,5);//5.6
        calculatorWithCounterClassic.incrementCountOperation();//2

        double powRes = calculatorWithCounterClassic.degree(devideRes, 2);//31.3599...6
        calculatorWithCounterClassic.incrementCountOperation();//3

        double sumRes = calculatorWithCounterClassic.sum(4.1, multiplyRes);//109.1
        calculatorWithCounterClassic.incrementCountOperation();//4

        double fiveResult = calculatorWithCounterClassic.sum(sumRes, powRes);//140.4599....8
        calculatorWithCounterClassic.incrementCountOperation();//5

        long countResult = calculatorWithCounterClassic.getCountOperation();

        System.out.println("Результат вычисления: " + fiveResult);//140.45999999999998
        System.out.println("Количество вызовов калькулятора: " + countResult);//5
    }
}
