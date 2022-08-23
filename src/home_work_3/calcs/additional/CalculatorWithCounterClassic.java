package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long countOperation;

    /**
     * Метод-счетчик использования калькуляторв
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Метод-геттер для получения результата работы счетчика использования калькулятора
     * @return long - количество вызовов калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}
