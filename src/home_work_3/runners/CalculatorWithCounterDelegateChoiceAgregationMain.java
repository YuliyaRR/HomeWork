package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calcChoiceAgrOper =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        CalculatorWithCounterAutoChoiceAgregation calcChoiceAgrMC =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        CalculatorWithCounterAutoChoiceAgregation calcChoiceAgrME =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        //4.1 + 15 * 7 + (28 / 5) ^ 2.
        double multResOper = calcChoiceAgrOper.multiply(15,7);
        double divResOper = calcChoiceAgrOper.divide(28,5);
        double powResOper = calcChoiceAgrOper.degree(divResOper,2);
        double nineResult = calcChoiceAgrOper.sum(4.1, calcChoiceAgrOper.sum(multResOper, powResOper));
        System.out.println(nineResult);
        System.out.println(calcChoiceAgrOper.getCountOperation());

        double multResMC = calcChoiceAgrMC.multiply(15,7);
        double divResMC = calcChoiceAgrMC.divide(28,5);
        double powResMC = calcChoiceAgrMC.degree(divResMC,2);
        double tenResult = calcChoiceAgrMC.sum(4.1, calcChoiceAgrMC.sum(multResMC, powResMC));
        System.out.println(tenResult);
        System.out.println(calcChoiceAgrMC.getCountOperation());

        double multResME = calcChoiceAgrME.multiply(15,7);
        double divResME = calcChoiceAgrME.divide(28,5);
        double powResME = calcChoiceAgrME.degree(divResME,2);
        double elevenResult = calcChoiceAgrME.sum(4.1, calcChoiceAgrME.sum(multResME, powResME));
        System.out.println(elevenResult);
        System.out.println(calcChoiceAgrME.getCountOperation());

    }
}
