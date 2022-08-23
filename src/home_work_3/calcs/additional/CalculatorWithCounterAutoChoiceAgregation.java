package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calcOperator;
    private CalculatorWithMathCopy calcMathCopy;
    private CalculatorWithMathExtends calcMathExtends;

    private long countOperation;

    /**
     * Метод-геттер для получения результата работы счетчика использования калькулятора
     * @return long - количество вызовов калькулятора
     */
    public long getCountOperation(){
        return countOperation;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator calc) {
        this.calcOperator = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy calc) {
        this.calcMathCopy = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calc) {
        this.calcMathExtends = calc;
    }

    /**
     * Метод производит деление двух чисел.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - делимое (double)
     * @param b - делитель (double)
     * @return - частное (double) - результат деления
     */
    public double divide (double a, double b) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.divide(a,b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.divide(a,b);
        } else {
            return calcMathExtends.divide(a,b);
        }

    }

    /**
     * Метод производит умножение двух чисел.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - первый множитель (double)
     * @param b - второй множитель (double)
     * @return - произведение (double) - результат умножения
     */
    public double multiply (double a, double b) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.multiply(a,b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.multiply(a,b);
        } else {
            return calcMathExtends.multiply(a,b);
        }
    }

    /**
     * Метод определяет разность двух чисел.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - уменьшаемое (double)
     * @param b - вычитаемое (double)
     * @return - разность двух чисел (double)
     */
    public double minus(double a, double b) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.minus(a,b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.minus(a,b);
        } else {
            return calcMathExtends.minus(a,b);
        }
    }

    /**
     * Метод определяет сумму двух чисел.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - первое слагаемое (double)
     * @param b - второе слагаемое (double)
     * @return - сумма двух чисел (double)
     */
    public double sum (double a, double b) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.sum(a,b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.sum(a,b);
        } else {
            return calcMathExtends.sum(a,b);
        }
    }

    /**
     * Метод возводит дробное положительное число в n-ую степень.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - число, которое необходимо возвести в степень (double)
     * @param b - степень(целое число), в которую необходимо возвести
     * @return - double (a в степени b)
     */
    public double degree(double a, int b) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.degree(a,b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.degree(a,b);
        } else {
            return calcMathExtends.degree(a,b);
        }
    }
    /**
     * Метод вычисляет модуль числа.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - число, модуль которого необходимо вычислить (double)
     * @return - значение числа по модулю (double)
     */
    public double module(double a) {
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.module(a);
        } else if (calcMathCopy != null) {
            return calcMathCopy.module(a);
        } else {
            return calcMathExtends.module(a);
        }
    }

    /**
     * Метод вычисляет квадратный корень из числа.
     * Реализация метода осуществляется в зависимости от типа объекта, полученного в конструкторе класса.
     * Функционал дополнен автоматически увеличивающимся счетчиком использования калькулятора.
     * @param a - число, квадратный корень которого необходимо вычислить (double)
     * @return - квадратный корень из числа (double)
     */
    public double squareRoot (double a){
        countOperation++;
        if(calcOperator != null) {
            return calcOperator.squareRoot(a);
        } else if (calcMathCopy != null) {
            return calcMathCopy.squareRoot(a);
        } else {
            return calcMathExtends.squareRoot(a);
        }
    }










    }
