package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод производит деление двух чисел
     * @param a - делимое (double)
     * @param b - делитель (double)
     * @throws ArithmeticException - если b = 0;
     * @return - частное (double) - результат деления
     */
    public double divide (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    /**
     * Метод производит умножение двух чисел
     * @param a - первый множитель (double)
     * @param b - второй множитель (double)
     * @return - произведение (double) - результат умножения
     */
    public double multiply (double a, double b) {
        return a * b;
    }

    /**
     * Метод определяет разность двух чисел
     * @param a - уменьшаемое (double)
     * @param b - вычитаемое (double)
     * @return - разность двух чисел (double)
     */
    public double minus(double a, double b) {
        return a - b;
    }

    /**
     * Метод определяет сумму двух чисел
     * @param a - первое слагаемое (double)
     * @param b - второе слагаемое (double)
     * @return - сумма двух чисел (double)
     */
    public double sum (double a, double b) {

        return a + b;
    }

    /**
     * Метод возводит дробное положительное число в n-ую степень, используя класс Math
     * @param a - число, которое необходимо возвести в степень (double)
     * @param b - степень(целое число), в которую необходимо возвести
     * @return - double (a в степени b)
     */
    public double degree(double a, int b) {

        return Math.pow(a,b);
    }

    /**
     * Метод вычисляет модуль числа, используя класс Math
     * @param a - число, модуль которого необходимо вычислить (double)
     * @return - значение числа по модулю (double)
     */
    public double module(double a) {
        return Math.abs(a);
    }

    /**
     * Метод вычисляет квадратный корень из числа, используя класс Math
     * @param a - число, квадратный корень которого необходимо вычислить (double)
     * @return - квадратный корень из числа (double)
     */
    public double squareRoot (double a) {
        return Math.sqrt(a);
    }

}
