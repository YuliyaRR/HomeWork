package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calcWithMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());

        //4.1 + 15 * 7 + (28 / 5) ^ 2.

        calcWithMemory.divide(28,5);
        calcWithMemory.saveInMemory();//5.6

        calcWithMemory.degree(calcWithMemory.getMemory(), 2);
        calcWithMemory.saveInMemory();//31.3599...6

        calcWithMemory.sum(calcWithMemory.multiply(15,7), calcWithMemory.getMemory());
        calcWithMemory.saveInMemory();//136.3599...9

        calcWithMemory.sum(4.1, calcWithMemory.getMemory());
        calcWithMemory.saveInMemory();//140.45999999999998

        System.out.println(calcWithMemory.getMemory());//140.45999999999998
        System.out.println(calcWithMemory.getCountOperation());//13



    }
}
