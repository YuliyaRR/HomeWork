package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

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
    public long getCountOperation(){
        return countOperation;
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
    */
    @Override
    public double degree(double a, int b) {
        incrementCountOperation();
        return super.degree(a, b);
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double module(double a) {
        incrementCountOperation();
        return super.module(a);
    }
    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    /**
     * Переопределение метода родительского класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Реальзация базового фунционала метода осуществляется родительским классом.
     */
    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }
}
