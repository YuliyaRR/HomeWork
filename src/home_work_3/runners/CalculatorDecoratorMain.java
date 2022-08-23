package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator iCalc = new CalculatorWithCounterAutoDecorator
                (new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        if (iCalc instanceof CalculatorWithCounterAutoDecorator) {
           CalculatorWithCounterAutoDecorator calcCounter = (CalculatorWithCounterAutoDecorator)iCalc;

           ICalculator iCalculator = calcCounter.getCalculator();

           if (iCalculator instanceof CalculatorWithMemoryDecorator) {
               CalculatorWithMemoryDecorator calcMemory = (CalculatorWithMemoryDecorator) iCalculator;

               //4.1 + 15 * 7 + (28 / 5) ^ 2.

               calcMemory.divide(28, 5);
               calcMemory.saveInMemory();
               calcMemory.degree(calcMemory.getMemory(), 2);
               calcMemory.saveInMemory();
               calcMemory.sum(calcMemory.multiply(15, 7), (calcMemory.getMemory()));
               calcMemory.saveInMemory();
               calcMemory.sum(4.1, calcMemory.getMemory());
               calcMemory.saveInMemory();
               System.out.println(calcMemory.getMemory());//140.45999999999998
               System.out.println(calcMemory.getCountOperation());//13

           }
       }















    }
}
