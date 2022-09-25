package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator{
    private ICalculator iCalculator;
    private long countOperation;
    private double inMemory;
    private double currentResult;

    public CalculatorWithMemoryDecorator (ICalculator iCalc){
        iCalculator = iCalc;
    }

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
     * Метод-геттер для получения вложенного калькулятора
     * @return ICalculator - вложенный калькулятор
     */
    public ICalculator getCalculator() {
        return iCalculator;
    }

    /**
     * Метод-геттер для получения последнго значение, записанного в память кальулятора.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @return double последнее значение из памяти
     */
    public double getMemory() {
        incrementCountOperation();
        double fromMemory = inMemory;
        inMemory = 0;
        currentResult = 0;
        return fromMemory;
    }

    /**
     * Метод сохраняет текущее значение в память калькулятора.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     */
    public void saveInMemory() {
        incrementCountOperation();
        inMemory = currentResult;

    }

    /**
     * Метод производит деление двух чисел, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - делимое (double)
     * @param b - делитель (double)
     * @return - частное (double) - результат деления
     */
    public double divide(double a, double b) {
        incrementCountOperation();
        return currentResult = iCalculator.divide(a, b);
    }

    /**
     * Метод производит умножение двух чисел, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - первый множитель (double)
     * @param b - второй множитель (double)
     * @return - произведение (double) - результат умножения
     */
    public double multiply (double a, double b) {
        incrementCountOperation();
        return currentResult = iCalculator.multiply(a, b);
    }

    /**
     * Метод определяет разность двух чисел, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - уменьшаемое (double)
     * @param b - вычитаемое (double)
     * @return - разность двух чисел (double)
     */
    public double minus(double a, double b) {
        incrementCountOperation();
        return currentResult = iCalculator.minus(a, b);
    }

    /**
     * Метод определяет сумму двух чисел, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - первое слагаемое (double)
     * @param b - второе слагаемое (double)
     * @return - сумма двух чисел (double)
     */
    public double sum (double a, double b) {
        incrementCountOperation();
        return currentResult = iCalculator.sum(a, b);
    }

    /**
     * Метод возводит дробное положительное число в n-ую степень, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - число, которое необходимо возвести в степень (double)
     * @param b - степень(целое число), в которую необходимо возвести
     * @return - double (a в степени b)
     */
    public double degree(double a, int b) {
        incrementCountOperation();
        return currentResult = iCalculator.degree(a, b);
    }

    /**
     * Метод вычисляет модуль числа, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - число, модуль которого необходимо вычислить (double)
     * @return - значение числа по модулю (double)
     */
    public double module(double a) {
        incrementCountOperation();
        return currentResult = iCalculator.module(a);
    }

    /**
     * Метод вычисляет квадратный корень из числа, делегируя выполнение объекту,
     * реализующему интерфейс ICalculator и полученному в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * Результат вычисления записывается в поле double currentResult.
     * @param a - число, квадратный корень которого необходимо вычислить (double)
     * @return - квадратный корень из числа (double)
     */
    public double squareRoot (double a) {
        incrementCountOperation();
        return currentResult = iCalculator.squareRoot(a);
    }




}
